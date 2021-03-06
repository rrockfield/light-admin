/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lightadmin.core.view.preparer;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.request.Request;
import org.lightadmin.core.config.domain.DomainTypeAdministrationConfiguration;

public class ShowViewPreparer extends ConfigurationAwareViewPreparer {

    @Override
    protected void execute(final Request request, final AttributeContext attributeContext, final DomainTypeAdministrationConfiguration configuration) {
        super.execute(request, attributeContext, configuration);

        addAttribute(attributeContext, "fields", configuration.getShowViewFragment().getFields());
    }
}