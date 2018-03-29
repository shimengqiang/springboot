<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<h1>
    userlist index.html

</h1>

<#if userList??>
<#list userList as item>

    <li>

        ${item.id},  ${item.name},    ${item.age},    ${item.sex}

    </li>

</#list>
<#else><h1>missing</h1>
</#if>
</body>
</html>