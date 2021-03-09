/**
 * This code is generated using [[https://www.scala-sbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package sbt.librarymanagement
/**
 * @param retrieveManaged If set to some RetrieveConfiguration, this enables retrieving dependencies to the specified directory.
                          Otherwise, dependencies are used directly from the cache.
 * @param missingOk If set to true, it ignores when artifacts are missing.
                    This setting could be uses when retrieving source/javadocs jars opportunistically.
 * @param logging Logging setting used specifially for library management.
 * @param logicalClock The clock that may be used for caching.
 * @param metadataDirectory The base directory that may be used to store metadata.
 * @param protocolHandlerDependencies Dependencies to load to handle custom protocols for dependency resolution
 */
final class UpdateConfiguration private (
  val retrieveManaged: Option[sbt.librarymanagement.RetrieveConfiguration],
  val missingOk: Boolean,
  val logging: sbt.librarymanagement.UpdateLogging,
  val logicalClock: sbt.librarymanagement.LogicalClock,
  val metadataDirectory: Option[java.io.File],
  val artifactFilter: Option[sbt.librarymanagement.ArtifactTypeFilter],
  val offline: Boolean,
  val frozen: Boolean,
  val protocolHandlerDependencies: Vector[sbt.librarymanagement.ModuleID]) extends Serializable {
  
  private def this() = this(None, false, sbt.librarymanagement.UpdateLogging.Default, sbt.librarymanagement.LogicalClock.unknown, None, None, false, false, Vector.empty)
  private def this(retrieveManaged: Option[sbt.librarymanagement.RetrieveConfiguration], missingOk: Boolean, logging: sbt.librarymanagement.UpdateLogging, logicalClock: sbt.librarymanagement.LogicalClock, metadataDirectory: Option[java.io.File], artifactFilter: Option[sbt.librarymanagement.ArtifactTypeFilter], offline: Boolean, frozen: Boolean) = this(retrieveManaged, missingOk, logging, logicalClock, metadataDirectory, artifactFilter, offline, frozen, Vector.empty)
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: UpdateConfiguration => (this.retrieveManaged == x.retrieveManaged) && (this.missingOk == x.missingOk) && (this.logging == x.logging) && (this.logicalClock == x.logicalClock) && (this.metadataDirectory == x.metadataDirectory) && (this.artifactFilter == x.artifactFilter) && (this.offline == x.offline) && (this.frozen == x.frozen) && (this.protocolHandlerDependencies == x.protocolHandlerDependencies)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (17 + "sbt.librarymanagement.UpdateConfiguration".##) + retrieveManaged.##) + missingOk.##) + logging.##) + logicalClock.##) + metadataDirectory.##) + artifactFilter.##) + offline.##) + frozen.##) + protocolHandlerDependencies.##)
  }
  override def toString: String = {
    "UpdateConfiguration(" + retrieveManaged + ", " + missingOk + ", " + logging + ", " + logicalClock + ", " + metadataDirectory + ", " + artifactFilter + ", " + offline + ", " + frozen + ", " + protocolHandlerDependencies + ")"
  }
  private[this] def copy(retrieveManaged: Option[sbt.librarymanagement.RetrieveConfiguration] = retrieveManaged, missingOk: Boolean = missingOk, logging: sbt.librarymanagement.UpdateLogging = logging, logicalClock: sbt.librarymanagement.LogicalClock = logicalClock, metadataDirectory: Option[java.io.File] = metadataDirectory, artifactFilter: Option[sbt.librarymanagement.ArtifactTypeFilter] = artifactFilter, offline: Boolean = offline, frozen: Boolean = frozen, protocolHandlerDependencies: Vector[sbt.librarymanagement.ModuleID] = protocolHandlerDependencies): UpdateConfiguration = {
    new UpdateConfiguration(retrieveManaged, missingOk, logging, logicalClock, metadataDirectory, artifactFilter, offline, frozen, protocolHandlerDependencies)
  }
  def withRetrieveManaged(retrieveManaged: Option[sbt.librarymanagement.RetrieveConfiguration]): UpdateConfiguration = {
    copy(retrieveManaged = retrieveManaged)
  }
  def withRetrieveManaged(retrieveManaged: sbt.librarymanagement.RetrieveConfiguration): UpdateConfiguration = {
    copy(retrieveManaged = Option(retrieveManaged))
  }
  def withMissingOk(missingOk: Boolean): UpdateConfiguration = {
    copy(missingOk = missingOk)
  }
  def withLogging(logging: sbt.librarymanagement.UpdateLogging): UpdateConfiguration = {
    copy(logging = logging)
  }
  def withLogicalClock(logicalClock: sbt.librarymanagement.LogicalClock): UpdateConfiguration = {
    copy(logicalClock = logicalClock)
  }
  def withMetadataDirectory(metadataDirectory: Option[java.io.File]): UpdateConfiguration = {
    copy(metadataDirectory = metadataDirectory)
  }
  def withMetadataDirectory(metadataDirectory: java.io.File): UpdateConfiguration = {
    copy(metadataDirectory = Option(metadataDirectory))
  }
  def withArtifactFilter(artifactFilter: Option[sbt.librarymanagement.ArtifactTypeFilter]): UpdateConfiguration = {
    copy(artifactFilter = artifactFilter)
  }
  def withArtifactFilter(artifactFilter: sbt.librarymanagement.ArtifactTypeFilter): UpdateConfiguration = {
    copy(artifactFilter = Option(artifactFilter))
  }
  def withOffline(offline: Boolean): UpdateConfiguration = {
    copy(offline = offline)
  }
  def withFrozen(frozen: Boolean): UpdateConfiguration = {
    copy(frozen = frozen)
  }
  def withProtocolHandlerDependencies(protocolHandlerDependencies: Vector[sbt.librarymanagement.ModuleID]): UpdateConfiguration = {
    copy(protocolHandlerDependencies = protocolHandlerDependencies)
  }
}
object UpdateConfiguration {
  
  def apply(): UpdateConfiguration = new UpdateConfiguration()
  def apply(retrieveManaged: Option[sbt.librarymanagement.RetrieveConfiguration], missingOk: Boolean, logging: sbt.librarymanagement.UpdateLogging, logicalClock: sbt.librarymanagement.LogicalClock, metadataDirectory: Option[java.io.File], artifactFilter: Option[sbt.librarymanagement.ArtifactTypeFilter], offline: Boolean, frozen: Boolean): UpdateConfiguration = new UpdateConfiguration(retrieveManaged, missingOk, logging, logicalClock, metadataDirectory, artifactFilter, offline, frozen)
  def apply(retrieveManaged: sbt.librarymanagement.RetrieveConfiguration, missingOk: Boolean, logging: sbt.librarymanagement.UpdateLogging, logicalClock: sbt.librarymanagement.LogicalClock, metadataDirectory: java.io.File, artifactFilter: sbt.librarymanagement.ArtifactTypeFilter, offline: Boolean, frozen: Boolean): UpdateConfiguration = new UpdateConfiguration(Option(retrieveManaged), missingOk, logging, logicalClock, Option(metadataDirectory), Option(artifactFilter), offline, frozen)
  def apply(retrieveManaged: Option[sbt.librarymanagement.RetrieveConfiguration], missingOk: Boolean, logging: sbt.librarymanagement.UpdateLogging, logicalClock: sbt.librarymanagement.LogicalClock, metadataDirectory: Option[java.io.File], artifactFilter: Option[sbt.librarymanagement.ArtifactTypeFilter], offline: Boolean, frozen: Boolean, protocolHandlerDependencies: Vector[sbt.librarymanagement.ModuleID]): UpdateConfiguration = new UpdateConfiguration(retrieveManaged, missingOk, logging, logicalClock, metadataDirectory, artifactFilter, offline, frozen, protocolHandlerDependencies)
  def apply(retrieveManaged: sbt.librarymanagement.RetrieveConfiguration, missingOk: Boolean, logging: sbt.librarymanagement.UpdateLogging, logicalClock: sbt.librarymanagement.LogicalClock, metadataDirectory: java.io.File, artifactFilter: sbt.librarymanagement.ArtifactTypeFilter, offline: Boolean, frozen: Boolean, protocolHandlerDependencies: Vector[sbt.librarymanagement.ModuleID]): UpdateConfiguration = new UpdateConfiguration(Option(retrieveManaged), missingOk, logging, logicalClock, Option(metadataDirectory), Option(artifactFilter), offline, frozen, protocolHandlerDependencies)
}
