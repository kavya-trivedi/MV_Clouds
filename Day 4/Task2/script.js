function handleRegister() {
    const username = document.getElementById('registerUsername').value.trim();
    const email = document.getElementById('registerEmail').value.trim();
    const password = document.getElementById('registerPassword').value.trim();
    const confirmPassword = document.getElementById('confirmPassword').value.trim();
    const errorDiv = document.getElementById('registerError');

    if (!username || !email || !password || !confirmPassword) {
        errorDiv.textContent = "All fields are required.";
        return;
    }

    if (password !== confirmPassword) {
        errorDiv.textContent = "Passwords do not match.";
        return;
    }

    const users = JSON.parse(localStorage.getItem('users')) || [];

    if (users.some(user => user.username === username)) {
        errorDiv.textContent = "Username already exists. Please choose another one.";
        return;
    }

    const newUser = { username, email, password };
    users.push(newUser);

    localStorage.setItem('users', JSON.stringify(users));

    localStorage.setItem('currentUser', JSON.stringify(newUser));

    window.location.href = 'confirm.html';
}

function handleLogin() {
    const username = document.getElementById('loginUsername').value.trim();
    const password = document.getElementById('loginPassword').value.trim();
    const errorDiv = document.getElementById('loginError');

    const users = JSON.parse(localStorage.getItem('users')) || [];

    const user = users.find(user => user.username === username && user.password === password);

    if (!user) {
        errorDiv.textContent = "Invalid username or password.";
        return;
    }

    alert(`Welcome, ${user.username}!`);
    window.location.href = 'index.html';
}
