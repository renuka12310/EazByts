document.addEventListener("DOMContentLoaded", function() {
    loadSales();
});

function loadSales() {
    fetch('/api/sales')
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(data => {
            const salesTableBody = document.querySelector('#salesTable tbody');
            salesTableBody.innerHTML = '';
            data.forEach(sale => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${sale.id}</td>
                    <td>${sale.saleName}</td>
                    <td>${sale.saleStatus}</td>
                    <td>${sale.potentialRevenue}</td>
                    <td>${sale.closeDate}</td>
                `;
                salesTableBody.appendChild(row);
            });
        })
        .catch(error => {
            console.error('Error fetching sales:', error);
        });
}
