### JBehave Example

Sample output of $mvn clean install

```
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building JBehave Stories 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.4.1:clean (default-clean) @ JBehaveDemo ---
[INFO] Deleting /Users/agiledev/Projects/misc-projects/JBehave_Demo/target
[INFO]
[INFO] --- maven-resources-plugin:2.4.3:resources (default-resources) @ JBehaveDemo ---
[WARNING] File encoding has not been set, using platform encoding MacRoman, i.e. build is platform dependent!
[WARNING] Using platform encoding (MacRoman actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO] Copying 1 resource
[INFO]
[INFO] --- jbehave-maven-plugin:4.0-beta-1:unpack-view-resources (unpack-view-resources) @ JBehaveDemo ---
[INFO] Unpacked /Users/agiledev/.m2/repository/org/jbehave/site/jbehave-site-resources/3.1.1/jbehave-site-resources-3.1.1.zip to /Users/agiledev/Projects/misc-projects/JBehave_Demo/target/jbehave/view
[INFO] Unpacked /Users/agiledev/.m2/repository/org/jbehave/jbehave-core/4.0-beta-1/jbehave-core-4.0-beta-1-resources.zip to /Users/agiledev/Projects/misc-projects/JBehave_Demo/target/jbehave/view
[INFO]
[INFO] --- maven-compiler-plugin:2.1:compile (default-compile) @ JBehaveDemo ---
[WARNING] File encoding has not been set, using platform encoding MacRoman, i.e. build is platform dependent!
[INFO] Compiling 4 source files to /Users/agiledev/Projects/misc-projects/JBehave_Demo/target/classes
[INFO]
[INFO] --- maven-resources-plugin:2.4.3:testResources (default-testResources) @ JBehaveDemo ---
[WARNING] Using platform encoding (MacRoman actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/agiledev/Projects/misc-projects/JBehave_Demo/src/test/resources
[INFO]
[INFO] --- maven-compiler-plugin:2.1:testCompile (default-testCompile) @ JBehaveDemo ---
[INFO] No sources to compile
[INFO]
[INFO] --- maven-surefire-plugin:2.7.2:test (default-test) @ JBehaveDemo ---
[INFO] No tests to run.
[INFO] Surefire report directory: /Users/agiledev/Projects/misc-projects/JBehave_Demo/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
There are no tests to run.

Results :

Tests run: 0, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.3.1:jar (default-jar) @ JBehaveDemo ---
[INFO] Building jar: /Users/agiledev/Projects/misc-projects/JBehave_Demo/target/JBehaveDemo-1.0-SNAPSHOT.jar
[INFO]
[INFO] --- jbehave-maven-plugin:4.0-beta-1:run-stories-as-embeddables (embeddable-stories) @ JBehaveDemo ---
[INFO] Running stories as embeddables using embedder Embedder[storyMapper=StoryMapper,storyRunner=<null>,embedderMonitor=MavenEmbedderMonitor,classLoader=EmbedderClassLoader[urls=[/Users/agiledev/Projects/misc-projects/JBehave_Demo/target/classes/, jbehave-core-4.0-beta-1.jar, junit-dep-4.8.2.jar, hamcrest-core-1.1.jar, hamcrest-library-1.1.jar, hamcrest-integration-1.1.jar, commons-collections-3.2.1.jar, commons-io-1.4.jar, commons-lang-2.5.jar, plexus-utils-2.0.5.jar, freemarker-2.3.16.jar, paranamer-2.4.jar, xstream-1.3.1.jar, xpp3_min-1.1.4c.jar],parent=ClassRealm[plugin>org.jbehave:jbehave-maven-plugin:4.0-beta-1, parent: sun.misc.Launcher$AppClassLoader@a6eb38a]],embedderControls=UnmodifiableEmbedderControls[EmbedderControls[batch=false,skip=false,generateViewAfterStories=true,ignoreFailureInStories=true,ignoreFailureInView=false,verboseFailures=false,verboseFiltering=false,storyTimeoutInSecs=300,threads=1]],embedderFailureStrategy=org.jbehave.core.embedder.Embedder$ThrowingRunningStoriesFailed@132d9844,configuration=org.jbehave.core.configuration.MostUsefulConfiguration@1667a232,candidateSteps=[],stepsFactory=<null>,metaFilters=[],systemProperties={},executorService=<null>,executorServiceCreated=false,performableTree=PerformableTree,storyManager=<null>]
[INFO] Found class names: [com.demo.TeamStories]
[INFO] Using controls UnmodifiableEmbedderControls[EmbedderControls[batch=false,skip=false,generateViewAfterStories=true,ignoreFailureInStories=true,ignoreFailureInView=false,verboseFailures=false,verboseFiltering=false,storyTimeoutInSecs=300,threads=1]]
[INFO] Running embeddable com.demo.TeamStories
[INFO] Processing system properties {}
[INFO] Using controls UnmodifiableEmbedderControls[EmbedderControls[batch=false,skip=false,generateViewAfterStories=true,ignoreFailureInStories=true,ignoreFailureInView=false,verboseFailures=false,verboseFiltering=false,storyTimeoutInSecs=300,threads=1]]

(BeforeStories)

[INFO] Running story com/demo/stories/team.story

(com/demo/stories/team.story)
Scenario: English Premier League Score for 2001-2002
Given the scores table of English Premier leage for year 2001-2002:

|No|name|P|W|L|D|win|lose|Pts|
|1|Arsenal|38|26|9|3|79|36|87|
|2|Liverpool|38|24|8|6|67|30|80|
|3|Manchester_U|38|24|5|9|87|45|77|
|4|Newcastle|38|21|8|9|74|52|71|
|5|Leeds|38|18|12|8|53|37|66|
|6|Chelsea|38|17|13|8|66|38|64|
|7|West_Ham|38|15|8|15|48|57|53|
|8|Aston_Villa|38|12|14|12|46|47|50|
|9|Tottenham|38|14|8|16|49|53|50|
|10|Blackburn|38|12|10|16|55|51|46|
|11|Southampton|38|12|9|17|46|54|45|
|12|Middlesbrough|38|12|9|17|35|47|45|
|13|Fulham|38|10|14|14|36|44|44|
|14|Charlton|38|10|14|14|38|49|44|
|15|Everton|38|11|10|17|45|57|43|
|16|Bolton|38|9|13|16|44|62|40|
|17|Sunderland|38|10|10|18|29|51|40|
|18|Ipswitch|38|9|9|20|41|64|36|
|19|Derby|38|8|6|24|33|63|30|
|20|Leicester|38|5|13|20|30|64|28|

When win and lose is calculated
Then the score should be as follow:

|No|name|P|W|L|D|win|lose|Pts|diff|lowest_diff|
|1|Arsenal|38|26|9|3|79|36|87|43|No|
|2|Liverpool|38|24|8|6|67|30|80|37|No|
|3|Manchester_U|38|24|5|9|87|45|77|42|No|
|4|Newcastle|38|21|8|9|74|52|71|22|No|
|5|Leeds|38|18|12|8|53|37|66|16|No|
|6|Chelsea|38|17|13|8|66|38|64|28|No|
|7|West_Ham|38|15|8|15|48|57|53|-9|No|
|8|Aston_Villa|38|12|14|12|46|47|50|-1|No|
|9|Tottenham|38|14|8|16|49|53|50|-4|No|
|10|Blackburn|38|12|10|16|55|51|46|4|No|
|11|Southampton|38|12|9|17|46|54|45|-8|No|
|12|Middlesbrough|38|12|9|17|35|47|45|-12|No|
|13|Fulham|38|10|14|14|36|44|44|-8|No|
|14|Charlton|38|10|14|14|38|49|44|-11|No|
|15|Everton|38|11|10|17|45|57|43|-12|No|
|16|Bolton|38|9|13|16|44|62|40|-18|No|
|17|Sunderland|38|10|10|18|29|51|40|-22|No|
|18|Ipswitch|38|9|9|20|41|64|36|-23|No|
|19|Derby|38|8|6|24|33|63|30|-30|No|
|20|Leicester|38|5|13|20|30|64|28|-34|Yes|




(AfterStories)

[INFO] Generating reports view to '/Users/agiledev/Projects/misc-projects/JBehave_Demo/target/jbehave' using formats '[stats, console, txt, html, xml]' and view properties '{defaultFormats=stats, decorateNonHtml=true, viewDirectory=view, decorated=ftl/jbehave-report-decorated.ftl, reports=ftl/jbehave-reports-with-totals.ftl, maps=ftl/jbehave-maps.ftl, navigator=ftl/jbehave-navigator.ftl, views=ftl/jbehave-views.ftl, nonDecorated=ftl/jbehave-report-non-decorated.ftl}'
[INFO] Reports view generated with 1 stories (of which 0 pending) containing 1 scenarios (of which 0 pending)
[INFO]
[INFO] --- maven-install-plugin:2.3.1:install (default-install) @ JBehaveDemo ---
[INFO] Installing /Users/agiledev/Projects/misc-projects/JBehave_Demo/target/JBehaveDemo-1.0-SNAPSHOT.jar to /Users/agiledev/.m2/repository/JBehaveDemo/JBehaveDemo/1.0-SNAPSHOT/JBehaveDemo-1.0-SNAPSHOT.jar
[INFO] Installing /Users/agiledev/Projects/misc-projects/JBehave_Demo/pom.xml to /Users/agiledev/.m2/repository/JBehaveDemo/JBehaveDemo/1.0-SNAPSHOT/JBehaveDemo-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.705s
[INFO] Finished at: Wed Oct 03 13:08:58 EST 2012
[INFO] Final Memory: 11M/81M
[INFO] ------------------------------------------------------------------------
```
