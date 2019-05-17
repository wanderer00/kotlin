/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.expressions.impl

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.expressions.FirResolvedQualifier
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName

class FirResolvedQualifierImpl(
    session: FirSession,
    psi: PsiElement?,
    override val packageFqName: FqName,
    override val relativeClassFqName: FqName?
) : FirResolvedQualifier, FirAbstractExpression(session, psi) {
    constructor(session: FirSession, psi: PsiElement?, classId: ClassId) : this(
        session,
        psi,
        classId.packageFqName,
        classId.relativeClassName
    )
}