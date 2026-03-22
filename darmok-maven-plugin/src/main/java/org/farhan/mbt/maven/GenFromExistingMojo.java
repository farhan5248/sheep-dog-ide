package org.farhan.mbt.maven;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "gen-from-existing", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class GenFromExistingMojo extends DarmokMojo {

	public void execute() throws MojoExecutionException {
		try {
			init();

			mojoLog.info("RGR Automation Plugin (gen-from-existing)");

			int cleanUpExit = runCleanUp();
			if (cleanUpExit != 0) {
				throw new MojoExecutionException("Clean up failed with exit code " + cleanUpExit);
			}

			int totalProcessed = 0;
			ScenarioEntry entry;
			while ((entry = getNextScenario()) != null) {
				mojoLog.info("Processing Scenario: " + entry.file() + "/" + entry.scenario() + " [" + entry.tag() + "]");
				processScenario(entry);
				totalProcessed++;
				mojoLog.info("");
			}

			mojoLog.info("RGR Automation Complete!");
			mojoLog.info("Total scenarios processed: " + totalProcessed);
		} catch (MojoExecutionException e) {
			throw e;
		} catch (Exception e) {
			throw new MojoExecutionException(e.getMessage(), e);
		} finally {
			cleanup();
		}
	}
}
