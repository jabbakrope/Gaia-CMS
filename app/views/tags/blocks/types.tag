%{
	models = [];
	for(controllerClass in play.Play.classloader.getAssignableClasses(_('models.blocks.Block'))) {
		resourceModel = _('utils.BlockManager').addBlockFromModel(controllerClass)
		models.add(resourceModel)
	}
}%

%{ models.eachWithIndex() { item, i -> }%
	%{
		attrs = [:]
		attrs.put('block', item)
	}%
    #{doBody vars:attrs /}
%{ } }%