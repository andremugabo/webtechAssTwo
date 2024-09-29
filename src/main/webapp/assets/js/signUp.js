/** =======================================
		         FUNCTIONS 
========================================== */
console.log("here");

const signUpFunction = (e) => {
    e.preventDefault();
    
   

    const username = document.querySelector("#username").value.trim();
    const password = document.querySelector("#password").value.trim();
    const confirmPassword = document.querySelector("#confirmPassword").value.trim();
    const role = document.querySelector("#role").value.trim();
	console.log(role);
    if (username !== "" && password !== "" && confirmPassword !== "" && role !== "") {
        if (password === confirmPassword) {
			console.log(username);
            // Proceed with fetch request
            fetch('signUp', {
			    method: 'POST',
			    headers: {
			        'Content-Type': 'application/x-www-form-urlencoded',
			    },
			    body: `username=${encodeURIComponent(username)}&password=${encodeURIComponent(password)}&confirmPassword=${encodeURIComponent(confirmPassword)}&role=${encodeURIComponent(role)}`,
			})
			.then(response => {
			    if (response.ok) {
			        console.log("User signed up successfully!");
			    } else {
			        console.log("Failed to sign up:", response.statusText);
			    }
			})
			.catch(error => console.error('Error:', error));


        }
    } 
};

window.addEventListener("DOMContentLoaded", () => {
    document.querySelector("#signupForm").addEventListener("submit", signUpFunction);
});
