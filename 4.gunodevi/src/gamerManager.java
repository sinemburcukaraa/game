class gamerManager implements gamerService{
	
	@Override
	public void login(gamer gamer) {
		System.out.println("yeni oyuncu giriþ yaptý : " + gamer.getFirstName());
	}
	@Override
	public void update(gamer gamer) {
		System.out.println("yeni oyuncu güncellendi : " + gamer.getFirstName());
	}
	@Override
	public void delete(gamer gamer) {
		System.out.println("yeni oyuncu silindi : " + gamer.getFirstName());
	}
}