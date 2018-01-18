$(function () {
    function createTagsHtml(tags) {
        var html = '';
        for (var tagIndex = 0; tagIndex < tags.length; tagIndex++) {
            html += '                   <div class="tag">' + tags[tagIndex] + '</div>';
        }

        return html;
    }

    $.get("/api/articles/", function (data) {
        for (var i = 0; i < data.length; i++) {
            var article = data[i];
            var html =
                '<div class="topic">' +
                '      <div class="title">' +
                '           <div class="article-name">' + article.name + '</div>' +
                '               <div class="tags">' + createTagsHtml(article.tags) + '</div>' +
                '            <div class="time">' + article.creationDate + '</div>' +
                '      </div>' +
                '      <div class="topic-content">' + article.preview + '</div>' +
                '      <div class="read-all-btn">' +
                '           <div class="read-fully">Read</div>' +
                '      </div>' +
                '</div>';
            $("#topic-wrapper")
                .append($(html));
        }

        $(".read-all-btn").click(function () {
            var $articleName = $(this).siblings(".title").children(".article-name").text();
            window.location.href = '/dispatcher?articleName=' + $articleName.trim().split(' ').join('_');
        });

    });
});