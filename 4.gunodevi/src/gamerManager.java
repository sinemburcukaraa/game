class gamerManager implements gamerService{
	
	@Override
	public void login(gamer gamer) {
		System.out.println("yeni oyuncu giri� yapt� : " + gamer.getFirstName());
	}
	@Override
	public void update(gamer gamer) {
		System.out.println("yeni oyuncu g�ncellendi : " + gamer.getFirstName());
	}
	@Override
	public void delete(gamer gamer) {
		System.out.println("yeni oyuncu silindi : " + gamer.getFirstName());
	}
}