import './App.css';
import bgImage from './assets/Underoath.jpg';
import profilePic from './assets/image.jpg';

function App() {
  return (
    <div className="app-container">
      {/* Background visual elements */}
      <div className="image-background" style={{ backgroundImage: `url(${bgImage})` }}></div>
      <div className="glow-orb"></div>

      <div className="content-wrapper">
        <header className="profile-section">
          <div className="avatar-container">
            <img 
  src={profilePic}
  alt="blankeyy profile" 
  className="avatar" 
/>
          </div>
          <h1 className="username">@blankeyy</h1>
        </header>

                <footer className="social-row">
          <a href="https://www.tiktok.com/@blankeyytv" className="social-icon" target="_blank" rel="noreferrer">TikTok</a>
          <span className="dot">∙</span>
          <a href="https://instagram.com/blvnke" className="social-icon" target="_blank" rel="noreferrer">Instagram</a>
          <span className="dot">∙</span>
          <a href="https://x.com/blankeyytv" className="social-icon" target="_blank" rel="noreferrer">X</a>
          <span className="dot">∙</span>
          <a href="https://open.spotify.com/user/7iosa6zosbstnzn6jxm1s0qqc" className="social-icon" target="_blank" rel="noreferrer">Spotify</a>
        </footer>

        <main className="link-stack">
          <a href="https://www.twitch.tv/blankeyy" className="link-card highlight" target="_blank" rel="noreferrer">
            Watch Me Live on Twitch! 👾
          </a>
          
          <a href="https://www.twitch.tv/subs/blankeyy" className="link-card" target="_blank" rel="noreferrer">
            Subscribe to me on Twitch 🎁
          </a>

          <a href="https://discord.gg/ayZseEsfjU" className="link-card" target="_blank" rel="noreferrer">
            Join my Discord Server 🙂
          </a>

          <a href="https://streamlabs.com/blankeyy/tip" className="link-card" target="_blank" rel="noreferrer">
            Paypal me 💸
          </a>

                    <a href="mailto:blankeyytv@outlook.com" className="link-card" target="_blank" rel="noreferrer">
            blankeyytv@outlook.com ✉️
          </a>
        </main>

<div className="spotify-embed">
  <iframe
    title="Spotify song embed"
    style={{ borderRadius: '12px' }}
    src="https://open.spotify.com/embed/track/08on2wzs5D8ccY4oRrMR7G?utm_source=generator&theme=0"
    width="100%"
    height="152"
    frameBorder="0"
    allowFullScreen
    allow="autoplay; clipboard-write; encrypted-media; fullscreen; picture-in-picture"
    loading="lazy"
  ></iframe>
</div>
        
      </div>
    </div>
  );
}

export default App;