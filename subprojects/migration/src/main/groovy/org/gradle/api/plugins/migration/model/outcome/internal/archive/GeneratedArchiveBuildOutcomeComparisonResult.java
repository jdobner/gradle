/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.plugins.migration.model.outcome.internal.archive;

import org.gradle.api.plugins.migration.model.association.BuildOutcomeAssociation;
import org.gradle.api.plugins.migration.model.compare.BuildOutcomeComparisonResultSupport;
import org.gradle.api.plugins.migration.model.outcome.internal.archive.entry.ArchiveEntryComparison;

import java.util.SortedSet;

public class GeneratedArchiveBuildOutcomeComparisonResult extends BuildOutcomeComparisonResultSupport<GeneratedArchiveBuildOutcome> {

    private final SortedSet<ArchiveEntryComparison> entryComparisons;

    public GeneratedArchiveBuildOutcomeComparisonResult(BuildOutcomeAssociation<GeneratedArchiveBuildOutcome> compared, SortedSet<ArchiveEntryComparison> entryComparisons) {
        super(compared);
        this.entryComparisons = entryComparisons;
    }

    public SortedSet<ArchiveEntryComparison> getEntryComparisons() {
        return entryComparisons;
    }
}
