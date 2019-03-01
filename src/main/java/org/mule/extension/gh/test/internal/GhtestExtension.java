package org.mule.extension.gh.test.internal;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.Operations;

/**
 * This is the main class of an extension, is the entry point from which
 * configurations, connection providers, operations and sources are going to be
 * declared.
 */
@Xml(prefix = "ghtest")
@Extension(name = "Ghtest")
@Operations(GhtestOperations.class)
public class GhtestExtension {

}
