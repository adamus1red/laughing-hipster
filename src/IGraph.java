import java.util.List;

public interface IGraph {
	public boolean insertNode(INode node);

	public boolean insertEdge(IEdge edge);

	public boolean removeNode(INode node);

	public boolean removeEdge(IEdge edge);

	public int noEdges();

	public int noNodes();

	public List<INode> successorNode(INode node);

	public List<INode> predecessorNode(INode node);
	
	public List<INode> searchRoute(INode start, INode end);

}
