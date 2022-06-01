package io.github.hogwartsschoolofmagic.discovery;

import static java.lang.System.nanoTime;
import static org.springframework.boot.SpringApplication.run;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * A class to run the entire spring application. To run, just use the command -
 * {@code mvn spring-boot:run}.
 *
 * @author Vladislav [SmithyVL] Kuznetsov.
 * @since 1.0.0.
 */
@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApp {
  /**
   * The Main method that launches the Spring context of the application - and outputs the duration
   * of the launch to the log.
   *
   * @param args launch arguments.
   */
  public static void main(String[] args) {
    var startTime = nanoTime();
    run(DiscoveryApp.class, args);
    log.info("DiscoveryApplication started for {} ms!", nanoTime() - startTime);
  }
}