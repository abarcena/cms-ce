/*
 * Copyright 2000-2011 Enonic AS
 * http://www.enonic.com/license
 */
package com.enonic.cms.domain.content.contentdata.legacy;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jdom.Document;
import org.jdom.Element;

import com.enonic.cms.domain.content.ContentKey;
import com.enonic.cms.domain.content.binary.BinaryDataAndBinary;
import com.enonic.cms.domain.content.binary.BinaryDataKey;

/**
 *
 */
public class LegacyCatalogContentData
    extends AbstractBaseLegacyContentData
{
    public LegacyCatalogContentData( Document contentDataXml )
    {
        super( contentDataXml );
    }

    protected String resolveTitle()
    {
        final Element nameEl = contentDataEl.getChild( "title" );
        return nameEl.getText();
    }

    protected List<BinaryDataAndBinary> resolveBinaryDataAndBinaryList()
    {
        return null;
    }

    public void replaceBinaryKeyPlaceholders( List<BinaryDataKey> binaryDatas )
    {
        // nothing to do for this type
    }

    public void turnBinaryKeysIntoPlaceHolders( Map<BinaryDataKey, Integer> indexByBinaryDataKey )
    {
        // nothing to do for this type
    }

    @Override
    public Set<ContentKey> resolveRelatedContentKeys()
    {
        // this content type contains no related content
        return new HashSet<ContentKey>();
    }
}
