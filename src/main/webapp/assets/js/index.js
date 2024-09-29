/**
 * 
 */
// Add functionality to enhance UX if needed

// Example: Toggle class for navbar during scrolling
window.addEventListener('scroll', function() {
    const nav = document.querySelector('nav');
    nav.classList.toggle('sticky', window.scrollY > 0);
});
