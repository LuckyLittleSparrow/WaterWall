package com.luckylittlesparrow.srvlist.recycler.state

import com.luckylittlesparrow.srvlist.recycler.filterable.FilterableSection
import com.luckylittlesparrow.srvlist.recycler.section.Section

/*
 *  Copyright 2019 Gusev Andrei
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

/**
 * State of section, trigger adapter updates on current section every time you change state
 *
 * @see Section
 * @see FilterableSection
 *
 * @author Andrei Gusev
 * @since  1.0
 */
enum class SectionState {
    LOADING,
    LOADED,
    FAILED,
    EMPTY
}