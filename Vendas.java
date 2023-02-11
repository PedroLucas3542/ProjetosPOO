public class TestaProdutos {
	
	public static void main(String args[]) {
		Livro livro = new Livro (1, 55.0, "Mapas Do Acaso: 123 Varia��es de um mesmo tema", "Humberto Gessinger", "010101001");
		System.out.println("Cod: " + livro.getCodigo());
		System.out.println("Pre�o: " + livro.getPreco());
		System.out.println("Desc: " + livro.getDescricao());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("ISBN: " + livro.getIsbn());
		
		CompactDisc cd = new CompactDisc (2, 25.0, "De F�", "Engenheiros do Hawaii", "MTV Brasil");
		System.out.println("Cod: " + cd.getCodigo());
		System.out.println("Pre�o: " + cd.getPreco());
		System.out.println("Desc: " + cd.getDescricao());		
		System.out.println("Artista: " + cd.getArtista());
		System.out.println("Gravadora: " + cd.getGravadora());
		
	}
}


public class CompactDisc extends Produto{
	private int codigo;
	private double preco;
	private String descricao;
	private String artista;
	private String gravadora;
	public CompactDisc(int codigo, double preco, String descricao, String artista, String gravadora) {
		this.codigo = codigo;
		this.preco = preco;
		this.artista = artista;
		this.gravadora = gravadora;
		this.descricao = descricao;
		
	}
	public String getArtista() {
		return artista;
	}
	public String getGravadora() {
		return gravadora;
	}
	public String getDescricao() {
		return descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public double getPreco() {
		return preco;
	}
	
}


public class Produto {
	public int codigo;
	public double preco;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
	
	
public class Livro extends Produto{
	private int codigo;
	private double preco;
	private String descricao;
	private String autor;
	private String isbn;
	public Livro(int codigo, double preco, String descricao, String autor, String isbn) {
		this.codigo = codigo;
		this.preco = preco;
		this.autor = autor;
		this.isbn = isbn;
		this.descricao = descricao;
	}
	public String getAutor() {
		return autor;
	}
	public String getIsbn() {
		return isbn;
	}	
	public String getDescricao() {
		return descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public double getPreco() {
		return preco;
	}
}