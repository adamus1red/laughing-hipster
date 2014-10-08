import java.util.Set;
public interface IEdge {
   
   public void setsEdge_label(String label);
   
   public String getEdge_label();
   
   public INode getStart_node();
   
   public void setStart_node(INode node);
   
   public INode getEnd_node();
   
   public void setEnd_node(INode node);
   }
