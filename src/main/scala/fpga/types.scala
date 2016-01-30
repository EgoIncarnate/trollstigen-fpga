import fpga.blocks.AnyBlock
import scala.collection.mutable.MutableList

package fpga{
  object Types{
    type Direction = String
    type Track = Int
    type Switch = Boolean
    type Segment = (Direction, Track, Switch)
    type Path = (Segment,Array[Segment])
    type PathDefinition = (Direction, Track => Track)
    type Connectivity = Array[Path]
    type ConnectionType = String
    type ConnectNumber = Int
    type FPGABlocks = Array[Array[AnyBlock]]
    type BlockName = String
    type LocationXY  = (Int,Int)
    type Subblock  = Int
    type PlaceInfo = (BlockName, LocationXY, Subblock)
    type Placement = List[PlaceInfo]
    type RouteInfo = (LocationXY, ConnectionType, ConnectNumber)
    type Route = (LocationXY, Segment, Segment)
    type Routes = Array[Route]
  }
}
