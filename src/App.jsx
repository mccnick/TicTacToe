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
          <p className="bio">Livestreams ∙ Gaming ∙ Atmospheric Vibes</p>
        </header>

        <main className="link-stack">
          <a href="https://www.twitch.tv/blankeyy" className="link-card highlight" target="_blank" rel="noreferrer">
            Watch Me Crash Out Live on Twitch!
          </a>
          
          <a href="https://discord.gg/ayZseEsfjU" className="link-card" target="_blank" rel="noreferrer">
            Join my Discord Server 🙂
          </a>

          <a href="https://www.twitch.tv/subs/blankeyy" className="link-card" target="_blank" rel="noreferrer">
            Subscribe to me on Twitch
          </a>

          <a href="https://streamlabs.com/blankeyy/tip" className="link-card" target="_blank" rel="noreferrer">
            Donate your hard earned cash!!
          </a>
        </main>

        <footer className="social-row">
          <a href="https://www.tiktok.com/@blankeyytv" className="social-icon" target="_blank" rel="noreferrer">TikTok</a>
          <span className="dot">∙</span>
          <a href="https://instagram.com/blvnke" className="social-icon" target="_blank" rel="noreferrer">Instagram</a>
          <span className="dot">∙</span>
          <a href="https://x.com/blankeyytv" className="social-icon" target="_blank" rel="noreferrer">X</a>
          <span className="dot">∙</span>
          <a href="https://open.spotify.com/user/7iosa6zosbstnzn6jxm1s0qqc" className="social-icon" target="_blank" rel="noreferrer">Spotify</a>
        </footer>
      </div>
    </div>
  );
}

export default App;