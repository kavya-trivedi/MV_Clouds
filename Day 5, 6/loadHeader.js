document.addEventListener("DOMContentLoaded", () => {
    const headerPlaceholder = document.getElementById("header-placeholder");

    fetch("header.html")
        .then(response => {
            if (!response.ok) {
                throw new Error("Failed to load header");
            }
            return response.text();
        })
        .then(headerHTML => {
            headerPlaceholder.innerHTML = headerHTML;
        })
        .catch(error => {
            console.error("Error loading header:", error);
        });
});
