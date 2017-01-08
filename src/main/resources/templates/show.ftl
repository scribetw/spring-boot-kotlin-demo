<#-- @ftlvariable name="posts" type="org.newstudio.demo.model.Post[]" -->
<!DOCTYPE html>
<html>
<head>
    <title>Show</title>
</head>
<body>

<#include "header.ftl">

<section>
<ul>
<#list posts as item>
<li>
${item.name}: ${item.content} (${item.date})
<#list item.images as img>
    <img src="${img.fileName}" height="${img.height}" width="${img.width}" />
</#list>
</li>
</#list>
</ul>
</section>

<#include "pagenav.ftl">

<#include "footer.ftl">

</body>
</html>