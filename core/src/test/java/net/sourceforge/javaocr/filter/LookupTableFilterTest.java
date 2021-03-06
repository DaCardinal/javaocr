/*
 * Copyright (c) 2003-2012, Ronald B. Cemer , Konstantin Pribluda, William Whitney, Andrea De Pasquale
 *
 *
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package net.sourceforge.javaocr.filter;

import junit.framework.TestCase;
import net.sourceforge.javaocr.ocr.PixelImage;

/**
 * test capability of lookup  table filter
 */
public class LookupTableFilterTest extends TestCase {
    public void testLookupIsPerformedProperly() {
        int[] lut = new int[]{255, 0};
        int[] data = new int[]{0, 1};
        
        PixelImage image = new PixelImage(data, 2, 1);
        LookupTableFilter filter = new LookupTableFilter(lut);

        filter.process(image);

        assertEquals(255, data[0]);
        assertEquals(0, data[1]);
    }
}
