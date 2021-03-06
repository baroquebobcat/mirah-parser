/*
 Copyright (c) 2010 The Mirah project authors. All Rights Reserved.
 All contributing project authors may be found in the NOTICE file.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/
package mirah.impl;

public enum Tokens {
  // Keywords first
  tBEGIN,
  tEND,
  t__ENCODING__,
  t__FILE__,
  t__LINE__,
  tAlias,
  tAnd,
  tBegin,
  tBreak,
  tCase,
  tClass,
  tDef,
  tDefined,
  tDo,
  tElse,
  tElsif,
  tEnd,
  tEnsure,
  tFalse,
  tFor,
  tIf,
  tIn,
  tModule,
  tNext,
  tNil,
  tNot,
  tOr,
  tRedo,
  tRescue,
  tRetry,
  tReturn,
  tSelf,
  tSuper,
  tThen,
  tTrue,
  tUndef,
  tUnless,
  tUntil,
  tWhen,
  tWhile,
  tYield,
  // ClassVar must be first after the keywords, followed by other
  // identifierish tokens.
  tClassVar,
  tInstVar,
  tCONSTANT,
  tIDENTIFIER,
  tFID,
  // FID must be last identifierish token.
  tNL,
  tSemi,
  tSlash,
  tQuote,
  tColons,
  tColon,
  tDot,
  tLParen,
  tLBrack,
  tLBrace,
  tBang,
  tNMatch,
  tNE,
  tLT,
  tLE,
  tLEG,
  tLShift,
  tLLShift,
  tGT,
  tGE,
  tRShift,
  tEEQ,
  tEEEQ,
  tMatch,
  tEQ,
  tAndEq,
  tOrEq,
  tOpAssign,
  tQuestion,
  tDigit,
  tBacktick,
  tDollar,
  tInstVarBacktick,
  tClassVarBacktick,
  tUNKNOWN,
  tEOF
}
