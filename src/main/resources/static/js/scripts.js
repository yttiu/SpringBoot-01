function editBook(id) {
    window.location.href = "/edit/" + id;
}

function deleteBook(id) {
    if (confirm("确定要删除这本书吗？")) {
        fetch("/delete/" + id, {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then(response => {
            if (response.ok) {
                window.location.href = "/list";
            } else {
                alert("删除失败，请重试。");
            }
        })
        .catch(error => {
            console.error('Error:', error);
            alert("删除失败，请重试。");
        });
    }
}