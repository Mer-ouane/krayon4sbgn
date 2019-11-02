/*
 * Copyright (c) 2018 Roland Wiese
 * This software is licensed under the Apache License, Version 2.0 (the "License"); you may not use this software except
 * in compliance with the License. You may obtain a copy of the License at  http://www.apache.org/licenses/LICENSE-2.0.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 *  an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package krayon.editor.base.command

object Delete : ApplicationCommand("DELETE") {
    override fun canExecute(param: Any?): Boolean {
        return true
    }

    override fun execute(param: Any?) {
        graphComponent.selection.selectedNodes.toList().forEach(graph::remove)
        graphComponent.selection.selectedEdges.toList().forEach(graph::remove)
        graphComponent.selection.selectedBends.toList().forEach(graph::remove)
        graphComponent.selection.selectedLabels.toList().forEach(graph::remove)
        graphComponent.selection.selectedPorts.toList().forEach(graph::remove)
    }
}
