<script>
	import Counter from './Counter.svelte';
</script>

<svelte:head>
	<title>Home</title>
	<meta name="description" content="Svelte demo app" />
</svelte:head>

<section>
	<h1>
		Gambling To Save The Trees Simulator
		<img src="/src/routes/thumbnail.png" alt="diagram of how to play game" />
	</h1>
	<p>
		Welcome to our Code For Impact Project! In this project, our idea was to have a currency-based system utilizing <br>
		virtual Coins, which could be gained through watching ADS! Then, we would've taken this money gained from said ads and <br>
		donated to environmental causes. We also planned that earned coins can be wagered on Blackjack. <br>
		There was also going to be a granted coin amount upon startup of the web app.
	</p>
	<h2>
		I would say good luck gambling, but ads are not implemented so.. yeah ( •̀ᴗ•́ )
	</h2>


</section>

<style>
	section {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		flex: 0.6;
	}

	h1 {
		width: 100%;
		font-family:'Trebuchet MS';
		font-weight: bold;
		color: black
	}

	p {
		font-family: 'Gill Sans';
		font-size: 20px;
		color: black;
	}
	h2 {
		color: green;
		font-family: fantasy;
	}
</style>
