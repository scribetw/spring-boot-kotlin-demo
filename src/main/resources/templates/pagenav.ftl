<#-- @ftlvariable name="page" type="org.springframework.data.domain.Page" -->
<nav>
    <ol>
        <#if page.first>
        <li>|&lt;</li>
        <#else>
        <li><a href="?page=0">|&lt;</a></li>
        </#if>

        <#list 0..!page.totalPages as p>
        <#if p == page.number>
        <li>${p}</li>
        <#else>
        <li><a href="?page=${p}">${p}</a></li>
        </#if>
        </#list>

        <#if page.last>
        <li>&gt;|</li>
        <#else>
        <li><a href="?page=${page.totalPages - 1}">&gt;|</a></li>
        </#if>
    </ol>
</nav>