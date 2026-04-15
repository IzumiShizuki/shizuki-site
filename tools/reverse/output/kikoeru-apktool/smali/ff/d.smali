.class public final Lff/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final c:Lff/d;

.field public static final d:Lff/d;


# instance fields
.field public final a:J

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lff/d;

    .line 2
    .line 3
    const-wide v1, -0x701cefeb9bec00L

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v0, v1, v2, v3}, Lff/d;-><init>(JI)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lff/d;->c:Lff/d;

    .line 13
    .line 14
    new-instance v0, Lff/d;

    .line 15
    .line 16
    const-wide v1, 0x701cd2fa9578ffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const v3, 0x3b9ac9ff

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, v2, v3}, Lff/d;-><init>(JI)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lff/d;->d:Lff/d;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(JI)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lff/d;->a:J

    .line 5
    .line 6
    iput p3, p0, Lff/d;->b:I

    .line 7
    .line 8
    const-wide v0, -0x701cefeb9bec00L

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmp-long p3, v0, p1

    .line 14
    .line 15
    if-gtz p3, :cond_0

    .line 16
    .line 17
    const-wide v0, 0x701cd2fa957900L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long p3, p1, v0

    .line 23
    .line 24
    if-gez p3, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    const-string p2, "Instant exceeds minimum or maximum instant"

    .line 30
    .line 31
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 1
    check-cast p1, Lff/d;

    .line 2
    .line 3
    const-string v0, "other"

    .line 4
    .line 5
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v0, p0, Lff/d;->a:J

    .line 9
    .line 10
    iget-wide v2, p1, Lff/d;->a:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Ljc/l;->h(JJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return v0

    .line 19
    :cond_0
    iget v0, p0, Lff/d;->b:I

    .line 20
    .line 21
    iget p1, p1, Lff/d;->b:I

    .line 22
    .line 23
    invoke-static {v0, p1}, Ljc/l;->g(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lff/d;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lff/d;

    .line 8
    .line 9
    iget-wide v0, p1, Lff/d;->a:J

    .line 10
    .line 11
    iget-wide v2, p0, Lff/d;->a:J

    .line 12
    .line 13
    cmp-long v4, v2, v0

    .line 14
    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lff/d;->b:I

    .line 18
    .line 19
    iget p1, p1, Lff/d;->b:I

    .line 20
    .line 21
    if-ne v0, p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1

    .line 26
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 27
    return p1
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    iget-wide v1, p0, Lff/d;->a:J

    .line 4
    .line 5
    ushr-long v3, v1, v0

    .line 6
    .line 7
    xor-long/2addr v1, v3

    .line 8
    long-to-int v0, v1

    .line 9
    iget v1, p0, Lff/d;->b:I

    .line 10
    .line 11
    mul-int/lit8 v1, v1, 0x33

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    return v1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final toString()Ljava/lang/String;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-wide v2, v0, Lff/d;->a:J

    .line 9
    .line 10
    const-wide/32 v4, 0x15180

    .line 11
    .line 12
    .line 13
    div-long v6, v2, v4

    .line 14
    .line 15
    xor-long v8, v2, v4

    .line 16
    .line 17
    const-wide/16 v10, -0x1

    .line 18
    .line 19
    const-wide/16 v12, 0x0

    .line 20
    .line 21
    cmp-long v14, v8, v12

    .line 22
    .line 23
    if-gez v14, :cond_0

    .line 24
    .line 25
    mul-long v8, v6, v4

    .line 26
    .line 27
    cmp-long v14, v8, v2

    .line 28
    .line 29
    if-eqz v14, :cond_0

    .line 30
    .line 31
    add-long/2addr v6, v10

    .line 32
    :cond_0
    rem-long/2addr v2, v4

    .line 33
    xor-long v8, v2, v4

    .line 34
    .line 35
    neg-long v14, v2

    .line 36
    or-long/2addr v14, v2

    .line 37
    and-long/2addr v8, v14

    .line 38
    const/16 v14, 0x3f

    .line 39
    .line 40
    shr-long/2addr v8, v14

    .line 41
    and-long/2addr v4, v8

    .line 42
    add-long/2addr v2, v4

    .line 43
    long-to-int v3, v2

    .line 44
    const v2, 0xafaa8

    .line 45
    .line 46
    .line 47
    int-to-long v4, v2

    .line 48
    add-long/2addr v6, v4

    .line 49
    const/16 v2, 0x3c

    .line 50
    .line 51
    int-to-long v4, v2

    .line 52
    sub-long/2addr v6, v4

    .line 53
    const/16 v2, 0x190

    .line 54
    .line 55
    const v4, 0x23ab1

    .line 56
    .line 57
    .line 58
    cmp-long v5, v6, v12

    .line 59
    .line 60
    if-gez v5, :cond_1

    .line 61
    .line 62
    const-wide/16 v8, 0x1

    .line 63
    .line 64
    add-long v14, v6, v8

    .line 65
    .line 66
    move-wide/from16 v16, v8

    .line 67
    .line 68
    int-to-long v8, v4

    .line 69
    div-long/2addr v14, v8

    .line 70
    sub-long v14, v14, v16

    .line 71
    .line 72
    move-wide/from16 v16, v10

    .line 73
    .line 74
    int-to-long v10, v2

    .line 75
    mul-long v10, v10, v14

    .line 76
    .line 77
    neg-long v14, v14

    .line 78
    mul-long v14, v14, v8

    .line 79
    .line 80
    add-long/2addr v6, v14

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    move-wide/from16 v16, v10

    .line 83
    .line 84
    move-wide v10, v12

    .line 85
    :goto_0
    int-to-long v8, v2

    .line 86
    mul-long v14, v8, v6

    .line 87
    .line 88
    const/16 v2, 0x24f

    .line 89
    .line 90
    move-wide/from16 v18, v12

    .line 91
    .line 92
    int-to-long v12, v2

    .line 93
    add-long/2addr v14, v12

    .line 94
    int-to-long v4, v4

    .line 95
    div-long/2addr v14, v4

    .line 96
    const/16 v2, 0x16d

    .line 97
    .line 98
    int-to-long v4, v2

    .line 99
    mul-long v12, v4, v14

    .line 100
    .line 101
    const/4 v2, 0x4

    .line 102
    move-wide/from16 v20, v4

    .line 103
    .line 104
    int-to-long v4, v2

    .line 105
    div-long v22, v14, v4

    .line 106
    .line 107
    add-long v22, v22, v12

    .line 108
    .line 109
    const/16 v2, 0x64

    .line 110
    .line 111
    int-to-long v12, v2

    .line 112
    div-long v24, v14, v12

    .line 113
    .line 114
    sub-long v22, v22, v24

    .line 115
    .line 116
    div-long v24, v14, v8

    .line 117
    .line 118
    add-long v24, v24, v22

    .line 119
    .line 120
    sub-long v22, v6, v24

    .line 121
    .line 122
    cmp-long v2, v22, v18

    .line 123
    .line 124
    if-gez v2, :cond_2

    .line 125
    .line 126
    add-long v14, v14, v16

    .line 127
    .line 128
    mul-long v16, v20, v14

    .line 129
    .line 130
    div-long v4, v14, v4

    .line 131
    .line 132
    add-long v4, v4, v16

    .line 133
    .line 134
    div-long v12, v14, v12

    .line 135
    .line 136
    sub-long/2addr v4, v12

    .line 137
    div-long v8, v14, v8

    .line 138
    .line 139
    add-long/2addr v8, v4

    .line 140
    sub-long v22, v6, v8

    .line 141
    .line 142
    :cond_2
    move-wide/from16 v4, v22

    .line 143
    .line 144
    add-long/2addr v14, v10

    .line 145
    long-to-int v2, v4

    .line 146
    mul-int/lit8 v4, v2, 0x5

    .line 147
    .line 148
    add-int/lit8 v4, v4, 0x2

    .line 149
    .line 150
    div-int/lit16 v4, v4, 0x99

    .line 151
    .line 152
    add-int/lit8 v5, v4, 0x2

    .line 153
    .line 154
    rem-int/lit8 v5, v5, 0xc

    .line 155
    .line 156
    const/4 v6, 0x1

    .line 157
    add-int/2addr v5, v6

    .line 158
    mul-int/lit16 v7, v4, 0x132

    .line 159
    .line 160
    add-int/lit8 v7, v7, 0x5

    .line 161
    .line 162
    div-int/lit8 v7, v7, 0xa

    .line 163
    .line 164
    sub-int/2addr v2, v7

    .line 165
    add-int/2addr v2, v6

    .line 166
    div-int/lit8 v4, v4, 0xa

    .line 167
    .line 168
    int-to-long v7, v4

    .line 169
    add-long/2addr v14, v7

    .line 170
    long-to-int v4, v14

    .line 171
    div-int/lit16 v7, v3, 0xe10

    .line 172
    .line 173
    mul-int/lit16 v8, v7, 0xe10

    .line 174
    .line 175
    sub-int/2addr v3, v8

    .line 176
    div-int/lit8 v8, v3, 0x3c

    .line 177
    .line 178
    mul-int/lit8 v9, v8, 0x3c

    .line 179
    .line 180
    sub-int/2addr v3, v9

    .line 181
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    const/16 v10, 0x3e8

    .line 186
    .line 187
    const/4 v11, 0x0

    .line 188
    const/16 v12, 0x2710

    .line 189
    .line 190
    if-ge v9, v10, :cond_4

    .line 191
    .line 192
    new-instance v9, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    const-string v10, "deleteCharAt(...)"

    .line 198
    .line 199
    if-ltz v4, :cond_3

    .line 200
    .line 201
    add-int/2addr v4, v12

    .line 202
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-static {v4, v10}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_3
    sub-int/2addr v4, v12

    .line 214
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-static {v4, v10}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    :goto_1
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_4
    if-lt v4, v12, :cond_5

    .line 229
    .line 230
    const/16 v9, 0x2b

    .line 231
    .line 232
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    :cond_5
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    :goto_2
    const/16 v4, 0x2d

    .line 239
    .line 240
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-static {v1, v1, v5}, Lff/f;->h(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-static {v1, v1, v2}, Lff/f;->h(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)V

    .line 250
    .line 251
    .line 252
    const/16 v2, 0x54

    .line 253
    .line 254
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-static {v1, v1, v7}, Lff/f;->h(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)V

    .line 258
    .line 259
    .line 260
    const/16 v2, 0x3a

    .line 261
    .line 262
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-static {v1, v1, v8}, Lff/f;->h(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-static {v1, v1, v3}, Lff/f;->h(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)V

    .line 272
    .line 273
    .line 274
    iget v2, v0, Lff/d;->b:I

    .line 275
    .line 276
    if-eqz v2, :cond_7

    .line 277
    .line 278
    const/16 v3, 0x2e

    .line 279
    .line 280
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    :goto_3
    add-int/lit8 v3, v11, 0x1

    .line 284
    .line 285
    sget-object v4, Lff/f;->a:[I

    .line 286
    .line 287
    aget v5, v4, v3

    .line 288
    .line 289
    rem-int v5, v2, v5

    .line 290
    .line 291
    if-nez v5, :cond_6

    .line 292
    .line 293
    move v11, v3

    .line 294
    goto :goto_3

    .line 295
    :cond_6
    rem-int/lit8 v3, v11, 0x3

    .line 296
    .line 297
    sub-int/2addr v11, v3

    .line 298
    aget v3, v4, v11

    .line 299
    .line 300
    div-int/2addr v2, v3

    .line 301
    rsub-int/lit8 v3, v11, 0x9

    .line 302
    .line 303
    aget v3, v4, v3

    .line 304
    .line 305
    add-int/2addr v2, v3

    .line 306
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    const-string v3, "null cannot be cast to non-null type java.lang.String"

    .line 311
    .line 312
    invoke-static {v2, v3}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    const-string v3, "substring(...)"

    .line 320
    .line 321
    invoke-static {v2, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    :cond_7
    const/16 v2, 0x5a

    .line 328
    .line 329
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    return-object v1
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method
