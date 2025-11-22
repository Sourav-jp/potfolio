// Navbar toggle for mobile
const menuToggle = document.getElementById('menu-toggle');
const navLinks = document.querySelector('.nav-links');
menuToggle.onclick = () => navLinks.classList.toggle('active');

// Animate Progress Bars (About section)
window.addEventListener('DOMContentLoaded', () => {
  document.querySelectorAll('.progress-bar').forEach(bar => {
    let percent = bar.getAttribute('data-percent');
    if (percent) {
      setTimeout(() => {
        let prog = document.createElement('div');
        prog.style.width = percent;
        bar.appendChild(prog);
      }, 400);
    }
  });
});

// Portfolio Modal Popup
function openModal(imgSrc){
  const modal = document.getElementById('modal');
  const modalImg = document.getElementById('modal-img');
  modal.style.display = 'flex';
  modalImg.src = imgSrc;
}
function closeModal(){
  document.getElementById('modal').style.display = 'none';
}
document.getElementById('modal-img').onclick = function(event){
  event.stopPropagation();
};

// Dummy contact form handler
document.getElementById('contact-form').onsubmit = function(e){
  e.preventDefault();
  alert('Thank you for your message!');
  this.reset();
}
