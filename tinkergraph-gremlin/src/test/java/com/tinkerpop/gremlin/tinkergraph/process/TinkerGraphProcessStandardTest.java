package com.tinkerpop.gremlin.tinkergraph.process;

import com.tinkerpop.gremlin.AbstractGraphProvider;
import com.tinkerpop.gremlin.process.ProcessStandardSuite;
import com.tinkerpop.gremlin.structure.Graph;
import com.tinkerpop.gremlin.tinkergraph.TinkerGraphGraphProvider;
import com.tinkerpop.gremlin.tinkergraph.structure.TinkerGraph;
import org.apache.commons.configuration.Configuration;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Executes the Standard Gremlin Process Test Suite using TinkerGraph.
 *
 * @author Stephen Mallette (http://stephen.genoprime.com)
 */
@RunWith(ProcessStandardSuite.class)
@ProcessStandardSuite.GraphProviderClass(TinkerGraphGraphProvider.class)
public class TinkerGraphProcessStandardTest {
}
