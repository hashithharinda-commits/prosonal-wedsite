
html_code = '''<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>The Fashion | Web Developer</title>

<style>
@import url('https://fonts.googleapis.com/css2?family=Orbitron:wght@400;700;900&family=Rajdhani:wght@300;500;700&display=swap');

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
}

:root {
    --primary: #00f7ff;
    --secondary: #ff00ff;
    --dark: #0a0a0f;
    --darker: #050508;
    --card-bg: rgba(255, 255, 255, 0.03);
    --glow: 0 0 20px rgba(0, 247, 255, 0.5);
}

body{
    background: var(--darker);
    color: white;
    font-family: 'Rajdhani', sans-serif;
    overflow-x: hidden;
}

/* Animated Background */
.bg-animation {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    z-index: -1;
    background: 
        radial-gradient(circle at 20% 80%, rgba(0, 247, 255, 0.15) 0%, transparent 50%),
        radial-gradient(circle at 80% 20%, rgba(255, 0, 255, 0.1) 0%, transparent 50%),
        var(--darker);
}

.bg-animation::before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    background-image: 
        linear-gradient(rgba(0, 247, 255, 0.03) 1px, transparent 1px),
        linear-gradient(90deg, rgba(0, 247, 255, 0.03) 1px, transparent 1px);
    background-size: 50px 50px;
    animation: gridMove 20s linear infinite;
}

@keyframes gridMove {
    0% { transform: translate(0, 0); }
    100% { transform: translate(50px, 50px); }
}

/* Header */
header{
    display:flex;
    justify-content:space-between;
    align-items:center;
    padding:20px 10%;
    position: fixed;
    width: 100%;
    top: 0;
    z-index: 1000;
    background: rgba(5, 5, 8, 0.8);
    backdrop-filter: blur(10px);
    border-bottom: 1px solid rgba(0, 247, 255, 0.1);
    transition: all 0.3s ease;
}

header.scrolled {
    padding: 15px 10%;
    background: rgba(5, 5, 8, 0.95);
}

.logo{
    font-size:28px;
    font-weight:900;
    color:var(--primary);
    font-family: 'Orbitron', sans-serif;
    text-transform: uppercase;
    letter-spacing: 2px;
    position: relative;
    text-shadow: 0 0 20px rgba(0, 247, 255, 0.5);
    animation: logoPulse 2s ease-in-out infinite;
}

@keyframes logoPulse {
    0%, 100% { text-shadow: 0 0 20px rgba(0, 247, 255, 0.5); }
    50% { text-shadow: 0 0 30px rgba(0, 247, 255, 0.8), 0 0 40px rgba(0, 247, 255, 0.4); }
}

nav {
    display: flex;
    gap: 30px;
}

nav a{
    color:white;
    text-decoration:none;
    font-size: 16px;
    font-weight: 500;
    letter-spacing: 1px;
    position: relative;
    padding: 5px 0;
    transition: all 0.3s ease;
}

nav a::after {
    content: '';
    position: absolute;
    bottom: 0;
    left: 0;
    width: 0;
    height: 2px;
    background: var(--primary);
    transition: width 0.3s ease;
    box-shadow: 0 0 10px var(--primary);
}

nav a:hover{
    color:var(--primary);
    text-shadow: 0 0 10px rgba(0, 247, 255, 0.5);
}

nav a:hover::after {
    width: 100%;
}

/* Hero Section */
.hero{
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    flex-direction:column;
    text-align:center;
    position: relative;
    padding: 0 10%;
}

.hero::before {
    content: '';
    position: absolute;
    width: 600px;
    height: 600px;
    background: radial-gradient(circle, rgba(0, 247, 255, 0.1) 0%, transparent 70%);
    border-radius: 50%;
    animation: float 6s ease-in-out infinite;
}

@keyframes float {
    0%, 100% { transform: translateY(0) scale(1); }
    50% { transform: translateY(-30px) scale(1.1); }
}

.hero-content {
    position: relative;
    z-index: 1;
}

.hero h1{
    font-size: clamp(40px, 8vw, 80px);
    font-family: 'Orbitron', sans-serif;
    font-weight: 900;
    margin-bottom: 20px;
    line-height: 1.1;
}

.hero span{
    color:var(--primary);
    display: inline-block;
    position: relative;
}

.hero span::after {
    content: '';
    position: absolute;
    bottom: -10px;
    left: 0;
    width: 100%;
    height: 4px;
    background: linear-gradient(90deg, var(--primary), var(--secondary));
    animation: lineGrow 2s ease-out infinite alternate;
}

@keyframes lineGrow {
    0% { transform: scaleX(0.8); opacity: 0.5; }
    100% { transform: scaleX(1); opacity: 1; }
}

.hero p{
    margin:30px 0;
    font-size: clamp(16px, 2.5vw, 22px);
    color:#aaa;
    max-width: 600px;
    line-height: 1.6;
    animation: fadeInUp 1s ease-out 0.5s both;
}

@keyframes fadeInUp {
    from {
        opacity: 0;
        transform: translateY(30px);
    }
    to {
        opacity: 1;
        transform: translateY(0);
    }
}

.btn{
    padding:15px 40px;
    background: transparent;
    border: 2px solid var(--primary);
    color:var(--primary);
    font-weight:700;
    font-size: 16px;
    cursor:pointer;
    border-radius: 5px;
    transition: all 0.3s ease;
    position: relative;
    overflow: hidden;
    font-family: 'Orbitron', sans-serif;
    letter-spacing: 2px;
    text-transform: uppercase;
    animation: fadeInUp 1s ease-out 0.8s both;
}

.btn::before {
    content: '';
    position: absolute;
    top: 0;
    left: -100%;
    width: 100%;
    height: 100%;
    background: linear-gradient(90deg, transparent, rgba(0, 247, 255, 0.4), transparent);
    transition: left 0.5s ease;
}

.btn:hover::before {
    left: 100%;
}

.btn:hover{
    background:var(--primary);
    color:var(--dark);
    box-shadow: 0 0 30px rgba(0, 247, 255, 0.6);
    transform: translateY(-2px);
}

/* Scroll Indicator */
.scroll-indicator {
    position: absolute;
    bottom: 40px;
    left: 50%;
    transform: translateX(-50%);
    display: flex;
    flex-direction: column;
    align-items: center;
    gap: 10px;
    opacity: 0.7;
    animation: bounce 2s infinite;
}

.scroll-indicator span {
    font-size: 12px;
    letter-spacing: 2px;
    text-transform: uppercase;
}

.scroll-line {
    width: 1px;
    height: 60px;
    background: linear-gradient(to bottom, var(--primary), transparent);
}

@keyframes bounce {
    0%, 100% { transform: translateX(-50%) translateY(0); }
    50% { transform: translateX(-50%) translateY(-10px); }
}

/* Sections */
section{
    padding:100px 10%;
    text-align:center;
    position: relative;
}

section h2{
    font-size: clamp(32px, 5vw, 48px);
    font-family: 'Orbitron', sans-serif;
    margin-bottom: 20px;
    position: relative;
    display: inline-block;
}

section h2::after {
    content: '';
    position: absolute;
    bottom: -10px;
    left: 50%;
    transform: translateX(-50%);
    width: 60px;
    height: 3px;
    background: var(--primary);
    box-shadow: 0 0 10px var(--primary);
}

section > p {
    max-width: 600px;
    margin: 40px auto 0;
    font-size: 18px;
    line-height: 1.8;
    color: #aaa;
}

/* Services */
.services{
    display:flex;
    justify-content:center;
    gap:30px;
    flex-wrap:wrap;
    margin-top:60px;
}

.card{
    background: var(--card-bg);
    padding:40px 30px;
    width:300px;
    border-radius:15px;
    border: 1px solid rgba(0, 247, 255, 0.1);
    transition: all 0.4s cubic-bezier(0.175, 0.885, 0.32, 1.275);
    position: relative;
    overflow: hidden;
    backdrop-filter: blur(10px);
}

.card::before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    height: 3px;
    background: linear-gradient(90deg, var(--primary), var(--secondary));
    transform: scaleX(0);
    transition: transform 0.4s ease;
}

.card:hover::before {
    transform: scaleX(1);
}

.card:hover{
    transform:translateY(-15px) scale(1.02);
    border-color: rgba(0, 247, 255, 0.3);
    box-shadow: 0 20px 40px rgba(0, 247, 255, 0.1), var(--glow);
}

.card h3{
    font-family: 'Orbitron', sans-serif;
    font-size: 22px;
    margin-bottom: 15px;
    color: var(--primary);
}

.card p {
    color: #888;
    line-height: 1.6;
    font-size: 16px;
}

.card-icon {
    font-size: 48px;
    margin-bottom: 20px;
    display: block;
    animation: iconFloat 3s ease-in-out infinite;
}

@keyframes iconFloat {
    0%, 100% { transform: translateY(0); }
    50% { transform: translateY(-10px); }
}

/* Contact Section */
#contact {
    background: linear-gradient(180deg, transparent 0%, rgba(0, 247, 255, 0.05) 100%);
}

#contact p {
    font-size: 20px;
    margin: 30px 0;
    color: var(--primary);
    font-family: 'Orbitron', sans-serif;
}

/* Footer */
footer{
    text-align:center;
    padding:40px 20px;
    background:var(--dark);
    border-top: 1px solid rgba(0, 247, 255, 0.1);
    position: relative;
}

footer::before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    height: 1px;
    background: linear-gradient(90deg, transparent, var(--primary), transparent);
}

footer p {
    color: #666;
    font-size: 14px;
    letter-spacing: 1px;
}

/* Glitch Effect for Logo */
.glitch {
    position: relative;
}

.glitch::before,
.glitch::after {
    content: attr(data-text);
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
}

.glitch::before {
    animation: glitch-1 2s infinite linear alternate-reverse;
    color: var(--secondary);
    z-index: -1;
}

.glitch::after {
    animation: glitch-2 3s infinite linear alternate-reverse;
    color: var(--primary);
    z-index: -2;
}

@keyframes glitch-1 {
    0%, 100% { clip-path: inset(0 0 0 0); transform: translate(0); }
    20% { clip-path: inset(20% 0 30% 0); transform: translate(-2px, 2px); }
    40% { clip-path: inset(50% 0 20% 0); transform: translate(2px, -2px); }
    60% { clip-path: inset(10% 0 60% 0); transform: translate(-2px, 0); }
    80% { clip-path: inset(80% 0 5% 0); transform: translate(2px, 2px); }
}

@keyframes glitch-2 {
    0%, 100% { clip-path: inset(0 0 0 0); transform: translate(0); }
    20% { clip-path: inset(60% 0 10% 0); transform: translate(2px, -2px); }
    40% { clip-path: inset(30% 0 40% 0); transform: translate(-2px, 2px); }
    60% { clip-path: inset(10% 0 70% 0); transform: translate(2px, 0); }
    80% { clip-path: inset(40% 0 30% 0); transform: translate(-2px, -2px); }
}

/* Responsive */
@media (max-width: 768px) {
    header {
        padding: 15px 5%;
    }
    
    nav {
        gap: 15px;
    }
    
    nav a {
        font-size: 14px;
    }
    
    .services {
        flex-direction: column;
        align-items: center;
    }
    
    .card {
        width: 100%;
        max-width: 350px;
    }
}

/* Reveal Animation */
.reveal {
    opacity: 0;
    transform: translateY(50px);
    transition: all 0.8s ease;
}

.reveal.active {
    opacity: 1;
    transform: translateY(0);
}
</style>
</head>

<body>

<div class="bg-animation"></div>

<header id="header">
<div class="logo glitch" data-text="THE FASHION">THE FASHION</div>
<nav>
<a href="#home">Home</a>
<a href="#about">About</a>
<a href="#services">Services</a>
<a href="#contact">Contact</a>
</nav>
</header>

<div class="hero" id="home">
<div class="hero-content">
<h1>Hello, I'm <span>The Fashion</span></h1>
<p>Creative Web Developer crafting digital experiences with modern technologies and futuristic design</p>
<button class="btn" onclick="contactAlert()">Hire Me</button>
</div>
<div class="scroll-indicator">
    <span>Scroll</span>
    <div class="scroll-line"></div>
</div>
</div>

<section id="about" class="reveal">
<h2>About Me</h2>
<p>I am a passionate web developer specializing in creating modern, fast, and responsive websites. With expertise in HTML, CSS, and JavaScript, I transform ideas into immersive digital experiences that captivate users and drive results.</p>
</section>

<section id="services" class="reveal">
<h2>My Services</h2>
<div class="services">
<div class="card">
<span class="card-icon">🎨</span>
<h3>Web Design</h3>
<p>Modern and clean website designs that combine aesthetics with functionality for maximum impact.</p>
</div>
<div class="card">
<span class="card-icon">📱</span>
<h3>Responsive Design</h3>
<p>Mobile-first approaches ensuring flawless experiences across all devices and screen sizes.</p>
</div>
<div class="card">
<span class="card-icon">⚡</span>
<h3>JavaScript Projects</h3>
<p>Interactive and dynamic web features powered by cutting-edge JavaScript frameworks.</p>
</div>
</div>
</section>

<section id="contact" class="reveal">
<h2>Contact Me</h2>
<p>your@email.com</p>
<button class="btn" onclick="contactAlert()">Send Message</button>
</section>

<footer>
<p>© 2026 The Fashion | All Rights Reserved</p>
</footer>

<script>
function contactAlert(){
    // Create custom modal instead of alert
    const modal = document.createElement('div');
    modal.style.cssText = `
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background: rgba(0,0,0,0.8);
        display: flex;
        justify-content: center;
        align-items: center;
        z-index: 10000;
        backdrop-filter: blur(5px);
        opacity: 0;
        transition: opacity 0.3s ease;
    `;
    
    modal.innerHTML = `
        <div style="
            background: linear-gradient(135deg, #1e1e2f, #2c3e50);
            padding: 40px;
            border-radius: 15px;
            border: 1px solid #00f7ff;
            text-align: center;
            max-width: 400px;
            transform: scale(0.8);
            transition: transform 0.3s ease;
            box-shadow: 0 0 40px rgba(0, 247, 255, 0.3);
        ">
            <h3 style="color: #00f7ff; font-family: Orbitron, sans-serif; margin-bottom: 20px; font-size: 24px;">Message Sent!</h3>
            <p style="color: #ccc; margin-bottom: 30px; font-size: 16px;">Thank you for contacting The Fashion! I'll get back to you soon.</p>
            <button onclick="this.closest('.modal-overlay').remove()" style="
                padding: 12px 30px;
                background: #00f7ff;
                border: none;
                color: #000;
                font-weight: bold;
                cursor: pointer;
                border-radius: 5px;
                font-family: Orbitron, sans-serif;
                transition: all 0.3s ease;
            " onmouseover="this.style.boxShadow='0 0 20px rgba(0, 247, 255, 0.5)'" onmouseout="this.style.boxShadow='none'">Close</button>
        </div>
    `;
    
    modal.className = 'modal-overlay';
    document.body.appendChild(modal);
    
    setTimeout(() => {
        modal.style.opacity = '1';
        modal.querySelector('div').style.transform = 'scale(1)';
    }, 10);
    
    modal.addEventListener('click', (e) => {
        if (e.target === modal) modal.remove();
    });
}

// Scroll animations
const observerOptions = {
    threshold: 0.1,
    rootMargin: '0px 0px -50px 0px'
};

const observer = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            entry.target.classList.add('active');
        }
    });
}, observerOptions);

document.querySelectorAll('.reveal').forEach(el => observer.observe(el));

// Header scroll effect
window.addEventListener('scroll', () => {
    const header = document.getElementById('header');
    if (window.scrollY > 50) {
        header.classList.add('scrolled');
    } else {
        header.classList.remove('scrolled');
    }
});

// Smooth scroll for navigation
document.querySelectorAll('nav a').forEach(anchor => {
    anchor.addEventListener('click', function(e) {
        e.preventDefault();
        const target = document.querySelector(this.getAttribute('href'));
        if (target) {
            target.scrollIntoView({
                behavior: 'smooth',
                block: 'start'
            });
        }
    });
});
</script>

</body>
</html>'''

print(html_code)
