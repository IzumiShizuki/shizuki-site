.class public final Ly6/d0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lr5/n;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:Lp4/s;

.field public final e:Landroid/util/SparseIntArray;

.field public final f:Ls3/e;

.field public final g:Lo6/j;

.field public final h:Landroid/util/SparseArray;

.field public final i:Landroid/util/SparseBooleanArray;

.field public final j:Landroid/util/SparseBooleanArray;

.field public final k:Ly6/x;

.field public l:Lw5/a;

.field public m:Lr5/q;

.field public n:I

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Ly6/f0;

.field public s:I

.field public t:I


# direct methods
.method public constructor <init>(IILo6/j;Lp4/y;Ls3/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, Ly6/d0;->f:Ls3/e;

    .line 5
    .line 6
    iput p1, p0, Ly6/d0;->a:I

    .line 7
    .line 8
    iput p2, p0, Ly6/d0;->b:I

    .line 9
    .line 10
    iput-object p3, p0, Ly6/d0;->g:Lo6/j;

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    if-eq p1, p2, :cond_1

    .line 14
    .line 15
    const/4 p2, 0x2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Ly6/d0;->c:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    invoke-static {p4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Ly6/d0;->c:Ljava/util/List;

    .line 35
    .line 36
    :goto_1
    new-instance p1, Lp4/s;

    .line 37
    .line 38
    const/16 p2, 0x24b8

    .line 39
    .line 40
    new-array p2, p2, [B

    .line 41
    .line 42
    const/4 p3, 0x0

    .line 43
    invoke-direct {p1, p2, p3}, Lp4/s;-><init>([BI)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Ly6/d0;->d:Lp4/s;

    .line 47
    .line 48
    new-instance p1, Landroid/util/SparseBooleanArray;

    .line 49
    .line 50
    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Ly6/d0;->i:Landroid/util/SparseBooleanArray;

    .line 54
    .line 55
    new-instance p2, Landroid/util/SparseBooleanArray;

    .line 56
    .line 57
    invoke-direct {p2}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Ly6/d0;->j:Landroid/util/SparseBooleanArray;

    .line 61
    .line 62
    new-instance p2, Landroid/util/SparseArray;

    .line 63
    .line 64
    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Ly6/d0;->h:Landroid/util/SparseArray;

    .line 68
    .line 69
    new-instance p4, Landroid/util/SparseIntArray;

    .line 70
    .line 71
    invoke-direct {p4}, Landroid/util/SparseIntArray;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p4, p0, Ly6/d0;->e:Landroid/util/SparseIntArray;

    .line 75
    .line 76
    new-instance p4, Ly6/x;

    .line 77
    .line 78
    const/4 p5, 0x1

    .line 79
    invoke-direct {p4, p5}, Ly6/x;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iput-object p4, p0, Ly6/d0;->k:Ly6/x;

    .line 83
    .line 84
    sget-object p4, Lr5/q;->n0:Lr5/p;

    .line 85
    .line 86
    iput-object p4, p0, Ly6/d0;->m:Lr5/q;

    .line 87
    .line 88
    const/4 p4, -0x1

    .line 89
    iput p4, p0, Ly6/d0;->t:I

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 95
    .line 96
    .line 97
    new-instance p1, Landroid/util/SparseArray;

    .line 98
    .line 99
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 103
    .line 104
    .line 105
    move-result p4

    .line 106
    const/4 p5, 0x0

    .line 107
    :goto_2
    if-ge p5, p4, :cond_2

    .line 108
    .line 109
    invoke-virtual {p1, p5}, Landroid/util/SparseArray;->keyAt(I)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {p1, p5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ly6/f0;

    .line 118
    .line 119
    invoke-virtual {p2, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    add-int/lit8 p5, p5, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    new-instance p1, Ly6/b0;

    .line 126
    .line 127
    new-instance p4, Lv2/e;

    .line 128
    .line 129
    invoke-direct {p4, p0}, Lv2/e;-><init>(Ly6/d0;)V

    .line 130
    .line 131
    .line 132
    invoke-direct {p1, p4}, Ly6/b0;-><init>(Ly6/a0;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, p3, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    const/4 p1, 0x0

    .line 139
    iput-object p1, p0, Ly6/d0;->r:Ly6/f0;

    .line 140
    .line 141
    return-void
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
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
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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

.method public final c()Lr5/n;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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

.method public final f(Lr5/o;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Ly6/d0;->d:Lp4/s;

    .line 2
    .line 3
    iget-object v0, v0, Lp4/s;->a:[B

    .line 4
    .line 5
    check-cast p1, Lr5/k;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0x3ac

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1, v2, v1}, Lr5/k;->i([BIIZ)Z

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    const/16 v3, 0xbc

    .line 15
    .line 16
    if-ge v2, v3, :cond_2

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_1
    const/4 v4, 0x5

    .line 20
    if-ge v3, v4, :cond_1

    .line 21
    .line 22
    mul-int/lit16 v4, v3, 0xbc

    .line 23
    .line 24
    add-int/2addr v4, v2

    .line 25
    aget-byte v4, v0, v4

    .line 26
    .line 27
    const/16 v5, 0x47

    .line 28
    .line 29
    if-eq v4, v5, :cond_0

    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p1, v2}, Lr5/k;->r(I)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_2
    return v1
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final g(Lr5/o;Lb0/a;)I
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-interface {v1}, Lr5/o;->getLength()J

    .line 8
    .line 9
    .line 10
    move-result-wide v12

    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    iget v5, v0, Ly6/d0;->a:I

    .line 14
    .line 15
    const/4 v6, 0x2

    .line 16
    if-ne v5, v6, :cond_0

    .line 17
    .line 18
    const/16 v17, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/16 v17, 0x0

    .line 22
    .line 23
    :goto_0
    iget-boolean v7, v0, Ly6/d0;->o:Z

    .line 24
    .line 25
    const/16 v8, 0x47

    .line 26
    .line 27
    const-wide/16 v18, -0x1

    .line 28
    .line 29
    if-eqz v7, :cond_15

    .line 30
    .line 31
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    iget-object v7, v0, Ly6/d0;->k:Ly6/x;

    .line 37
    .line 38
    cmp-long v11, v12, v18

    .line 39
    .line 40
    if-eqz v11, :cond_10

    .line 41
    .line 42
    if-nez v17, :cond_10

    .line 43
    .line 44
    iget-boolean v11, v7, Ly6/x;->d:Z

    .line 45
    .line 46
    if-nez v11, :cond_10

    .line 47
    .line 48
    iget v5, v0, Ly6/d0;->t:I

    .line 49
    .line 50
    iget-object v6, v7, Ly6/x;->b:Lp4/y;

    .line 51
    .line 52
    iget-object v11, v7, Ly6/x;->c:Lp4/s;

    .line 53
    .line 54
    if-gtz v5, :cond_1

    .line 55
    .line 56
    invoke-virtual {v7, v1}, Ly6/x;->a(Lr5/o;)V

    .line 57
    .line 58
    .line 59
    return v4

    .line 60
    :cond_1
    iget-boolean v12, v7, Ly6/x;->f:Z

    .line 61
    .line 62
    const v13, 0x1b8a0

    .line 63
    .line 64
    .line 65
    if-nez v12, :cond_8

    .line 66
    .line 67
    invoke-interface {v1}, Lr5/o;->getLength()J

    .line 68
    .line 69
    .line 70
    move-result-wide v14

    .line 71
    int-to-long v12, v13

    .line 72
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v12

    .line 76
    long-to-int v6, v12

    .line 77
    int-to-long v12, v6

    .line 78
    sub-long/2addr v14, v12

    .line 79
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 80
    .line 81
    .line 82
    move-result-wide v12

    .line 83
    cmp-long v16, v12, v14

    .line 84
    .line 85
    if-eqz v16, :cond_2

    .line 86
    .line 87
    iput-wide v14, v2, Lb0/a;->a:J

    .line 88
    .line 89
    return v3

    .line 90
    :cond_2
    invoke-virtual {v11, v6}, Lp4/s;->D(I)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1}, Lr5/o;->q()V

    .line 94
    .line 95
    .line 96
    iget-object v2, v11, Lp4/s;->a:[B

    .line 97
    .line 98
    invoke-interface {v1, v2, v4, v6}, Lr5/o;->z([BII)V

    .line 99
    .line 100
    .line 101
    iget v1, v11, Lp4/s;->b:I

    .line 102
    .line 103
    iget v2, v11, Lp4/s;->c:I

    .line 104
    .line 105
    add-int/lit16 v6, v2, -0xbc

    .line 106
    .line 107
    :goto_1
    if-lt v6, v1, :cond_7

    .line 108
    .line 109
    iget-object v12, v11, Lp4/s;->a:[B

    .line 110
    .line 111
    const/4 v13, -0x4

    .line 112
    const/4 v14, 0x0

    .line 113
    :goto_2
    const/4 v15, 0x4

    .line 114
    if-gt v13, v15, :cond_6

    .line 115
    .line 116
    mul-int/lit16 v15, v13, 0xbc

    .line 117
    .line 118
    add-int/2addr v15, v6

    .line 119
    if-lt v15, v1, :cond_4

    .line 120
    .line 121
    if-ge v15, v2, :cond_4

    .line 122
    .line 123
    aget-byte v15, v12, v15

    .line 124
    .line 125
    if-eq v15, v8, :cond_3

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_3
    add-int/2addr v14, v3

    .line 129
    const/4 v15, 0x5

    .line 130
    if-ne v14, v15, :cond_5

    .line 131
    .line 132
    invoke-static {v11, v6, v5}, Lua/l;->Y(Lp4/s;II)J

    .line 133
    .line 134
    .line 135
    move-result-wide v12

    .line 136
    cmp-long v14, v12, v9

    .line 137
    .line 138
    if-eqz v14, :cond_6

    .line 139
    .line 140
    move-wide v9, v12

    .line 141
    goto :goto_4

    .line 142
    :cond_4
    :goto_3
    const/4 v14, 0x0

    .line 143
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_6
    add-int/lit8 v6, v6, -0x1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_7
    :goto_4
    iput-wide v9, v7, Ly6/x;->h:J

    .line 150
    .line 151
    iput-boolean v3, v7, Ly6/x;->f:Z

    .line 152
    .line 153
    return v4

    .line 154
    :cond_8
    iget-wide v14, v7, Ly6/x;->h:J

    .line 155
    .line 156
    cmp-long v12, v14, v9

    .line 157
    .line 158
    if-nez v12, :cond_9

    .line 159
    .line 160
    invoke-virtual {v7, v1}, Ly6/x;->a(Lr5/o;)V

    .line 161
    .line 162
    .line 163
    return v4

    .line 164
    :cond_9
    iget-boolean v12, v7, Ly6/x;->e:Z

    .line 165
    .line 166
    if-nez v12, :cond_e

    .line 167
    .line 168
    int-to-long v12, v13

    .line 169
    invoke-interface {v1}, Lr5/o;->getLength()J

    .line 170
    .line 171
    .line 172
    move-result-wide v14

    .line 173
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 174
    .line 175
    .line 176
    move-result-wide v12

    .line 177
    long-to-int v6, v12

    .line 178
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 179
    .line 180
    .line 181
    move-result-wide v12

    .line 182
    int-to-long v14, v4

    .line 183
    cmp-long v16, v12, v14

    .line 184
    .line 185
    if-eqz v16, :cond_a

    .line 186
    .line 187
    iput-wide v14, v2, Lb0/a;->a:J

    .line 188
    .line 189
    return v3

    .line 190
    :cond_a
    invoke-virtual {v11, v6}, Lp4/s;->D(I)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v1}, Lr5/o;->q()V

    .line 194
    .line 195
    .line 196
    iget-object v2, v11, Lp4/s;->a:[B

    .line 197
    .line 198
    invoke-interface {v1, v2, v4, v6}, Lr5/o;->z([BII)V

    .line 199
    .line 200
    .line 201
    iget v1, v11, Lp4/s;->b:I

    .line 202
    .line 203
    iget v2, v11, Lp4/s;->c:I

    .line 204
    .line 205
    :goto_5
    if-ge v1, v2, :cond_d

    .line 206
    .line 207
    iget-object v6, v11, Lp4/s;->a:[B

    .line 208
    .line 209
    aget-byte v6, v6, v1

    .line 210
    .line 211
    if-eq v6, v8, :cond_b

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_b
    invoke-static {v11, v1, v5}, Lua/l;->Y(Lp4/s;II)J

    .line 215
    .line 216
    .line 217
    move-result-wide v12

    .line 218
    cmp-long v6, v12, v9

    .line 219
    .line 220
    if-eqz v6, :cond_c

    .line 221
    .line 222
    move-wide v9, v12

    .line 223
    goto :goto_7

    .line 224
    :cond_c
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_d
    :goto_7
    iput-wide v9, v7, Ly6/x;->g:J

    .line 228
    .line 229
    iput-boolean v3, v7, Ly6/x;->e:Z

    .line 230
    .line 231
    return v4

    .line 232
    :cond_e
    iget-wide v2, v7, Ly6/x;->g:J

    .line 233
    .line 234
    cmp-long v5, v2, v9

    .line 235
    .line 236
    if-nez v5, :cond_f

    .line 237
    .line 238
    invoke-virtual {v7, v1}, Ly6/x;->a(Lr5/o;)V

    .line 239
    .line 240
    .line 241
    return v4

    .line 242
    :cond_f
    invoke-virtual {v6, v2, v3}, Lp4/y;->b(J)J

    .line 243
    .line 244
    .line 245
    move-result-wide v2

    .line 246
    iget-wide v8, v7, Ly6/x;->h:J

    .line 247
    .line 248
    invoke-virtual {v6, v8, v9}, Lp4/y;->c(J)J

    .line 249
    .line 250
    .line 251
    move-result-wide v5

    .line 252
    sub-long/2addr v5, v2

    .line 253
    iput-wide v5, v7, Ly6/x;->i:J

    .line 254
    .line 255
    invoke-virtual {v7, v1}, Ly6/x;->a(Lr5/o;)V

    .line 256
    .line 257
    .line 258
    return v4

    .line 259
    :cond_10
    iget-boolean v11, v0, Ly6/d0;->p:Z

    .line 260
    .line 261
    if-nez v11, :cond_12

    .line 262
    .line 263
    iput-boolean v3, v0, Ly6/d0;->p:Z

    .line 264
    .line 265
    iget-wide v14, v7, Ly6/x;->i:J

    .line 266
    .line 267
    cmp-long v11, v14, v9

    .line 268
    .line 269
    if-eqz v11, :cond_11

    .line 270
    .line 271
    const/4 v9, 0x1

    .line 272
    new-instance v3, Lw5/a;

    .line 273
    .line 274
    iget-object v7, v7, Ly6/x;->b:Lp4/y;

    .line 275
    .line 276
    iget v10, v0, Ly6/d0;->t:I

    .line 277
    .line 278
    const/4 v11, 0x0

    .line 279
    new-instance v4, Lm3/l;

    .line 280
    .line 281
    const/16 v6, 0x1d

    .line 282
    .line 283
    invoke-direct {v4, v6}, Lm3/l;-><init>(I)V

    .line 284
    .line 285
    .line 286
    move v6, v5

    .line 287
    new-instance v5, Lah/j;

    .line 288
    .line 289
    invoke-direct {v5, v10, v7}, Lah/j;-><init>(ILp4/y;)V

    .line 290
    .line 291
    .line 292
    const-wide/16 v20, 0x1

    .line 293
    .line 294
    add-long v20, v14, v20

    .line 295
    .line 296
    move v10, v6

    .line 297
    move-wide v6, v14

    .line 298
    const-wide/16 v14, 0xbc

    .line 299
    .line 300
    const/16 v22, 0x2

    .line 301
    .line 302
    const/16 v16, 0x3ac

    .line 303
    .line 304
    move/from16 v24, v10

    .line 305
    .line 306
    const/16 v23, 0x0

    .line 307
    .line 308
    const-wide/16 v10, 0x0

    .line 309
    .line 310
    move-wide/from16 v8, v20

    .line 311
    .line 312
    move/from16 v25, v24

    .line 313
    .line 314
    const/4 v1, 0x0

    .line 315
    const/16 v20, 0x1

    .line 316
    .line 317
    invoke-direct/range {v3 .. v16}, Lw5/a;-><init>(Lr5/g;Lr5/i;JJJJJI)V

    .line 318
    .line 319
    .line 320
    iput-object v3, v0, Ly6/d0;->l:Lw5/a;

    .line 321
    .line 322
    iget-object v4, v0, Ly6/d0;->m:Lr5/q;

    .line 323
    .line 324
    iget-object v3, v3, Lw5/a;->a:Lr5/e;

    .line 325
    .line 326
    invoke-interface {v4, v3}, Lr5/q;->a(Lr5/b0;)V

    .line 327
    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_11
    move/from16 v25, v5

    .line 331
    .line 332
    move-wide v6, v14

    .line 333
    const/4 v1, 0x0

    .line 334
    const/16 v20, 0x1

    .line 335
    .line 336
    iget-object v3, v0, Ly6/d0;->m:Lr5/q;

    .line 337
    .line 338
    new-instance v4, Lr5/s;

    .line 339
    .line 340
    invoke-direct {v4, v6, v7}, Lr5/s;-><init>(J)V

    .line 341
    .line 342
    .line 343
    invoke-interface {v3, v4}, Lr5/q;->a(Lr5/b0;)V

    .line 344
    .line 345
    .line 346
    goto :goto_8

    .line 347
    :cond_12
    move/from16 v25, v5

    .line 348
    .line 349
    const/4 v1, 0x0

    .line 350
    const/16 v20, 0x1

    .line 351
    .line 352
    :goto_8
    iget-boolean v3, v0, Ly6/d0;->q:Z

    .line 353
    .line 354
    if-eqz v3, :cond_13

    .line 355
    .line 356
    iput-boolean v1, v0, Ly6/d0;->q:Z

    .line 357
    .line 358
    const-wide/16 v3, 0x0

    .line 359
    .line 360
    invoke-virtual {v0, v3, v4, v3, v4}, Ly6/d0;->i(JJ)V

    .line 361
    .line 362
    .line 363
    invoke-interface/range {p1 .. p1}, Lr5/o;->getPosition()J

    .line 364
    .line 365
    .line 366
    move-result-wide v5

    .line 367
    cmp-long v7, v5, v3

    .line 368
    .line 369
    if-eqz v7, :cond_13

    .line 370
    .line 371
    iput-wide v3, v2, Lb0/a;->a:J

    .line 372
    .line 373
    return v20

    .line 374
    :cond_13
    iget-object v3, v0, Ly6/d0;->l:Lw5/a;

    .line 375
    .line 376
    if-eqz v3, :cond_14

    .line 377
    .line 378
    iget-object v4, v3, Lw5/a;->c:Lr5/f;

    .line 379
    .line 380
    if-eqz v4, :cond_14

    .line 381
    .line 382
    move-object/from16 v4, p1

    .line 383
    .line 384
    invoke-virtual {v3, v4, v2}, Lw5/a;->b(Lr5/o;Lb0/a;)I

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    return v1

    .line 389
    :cond_14
    move-object/from16 v4, p1

    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_15
    move-object v4, v1

    .line 393
    move/from16 v25, v5

    .line 394
    .line 395
    const/4 v1, 0x0

    .line 396
    const/16 v20, 0x1

    .line 397
    .line 398
    :goto_9
    iget-object v2, v0, Ly6/d0;->d:Lp4/s;

    .line 399
    .line 400
    iget-object v3, v2, Lp4/s;->a:[B

    .line 401
    .line 402
    iget v5, v2, Lp4/s;->b:I

    .line 403
    .line 404
    rsub-int v5, v5, 0x24b8

    .line 405
    .line 406
    const/16 v6, 0xbc

    .line 407
    .line 408
    if-ge v5, v6, :cond_17

    .line 409
    .line 410
    invoke-virtual {v2}, Lp4/s;->a()I

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    if-lez v5, :cond_16

    .line 415
    .line 416
    iget v7, v2, Lp4/s;->b:I

    .line 417
    .line 418
    invoke-static {v3, v7, v3, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 419
    .line 420
    .line 421
    :cond_16
    invoke-virtual {v2, v3, v5}, Lp4/s;->E([BI)V

    .line 422
    .line 423
    .line 424
    :cond_17
    :goto_a
    invoke-virtual {v2}, Lp4/s;->a()I

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    iget-object v7, v0, Ly6/d0;->h:Landroid/util/SparseArray;

    .line 429
    .line 430
    if-ge v5, v6, :cond_1c

    .line 431
    .line 432
    iget v5, v2, Lp4/s;->c:I

    .line 433
    .line 434
    rsub-int v8, v5, 0x24b8

    .line 435
    .line 436
    invoke-interface {v4, v3, v5, v8}, Lm4/i;->read([BII)I

    .line 437
    .line 438
    .line 439
    move-result v8

    .line 440
    const/4 v9, -0x1

    .line 441
    if-ne v8, v9, :cond_1b

    .line 442
    .line 443
    const/4 v4, 0x0

    .line 444
    :goto_b
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    if-ge v4, v1, :cond_1a

    .line 449
    .line 450
    invoke-virtual {v7, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    check-cast v1, Ly6/f0;

    .line 455
    .line 456
    instance-of v2, v1, Ly6/w;

    .line 457
    .line 458
    if-eqz v2, :cond_19

    .line 459
    .line 460
    check-cast v1, Ly6/w;

    .line 461
    .line 462
    iget v2, v1, Ly6/w;->c:I

    .line 463
    .line 464
    const/4 v3, 0x3

    .line 465
    if-ne v2, v3, :cond_19

    .line 466
    .line 467
    iget v2, v1, Ly6/w;->j:I

    .line 468
    .line 469
    if-ne v2, v9, :cond_19

    .line 470
    .line 471
    if-eqz v17, :cond_18

    .line 472
    .line 473
    iget-object v2, v1, Ly6/w;->a:Ly6/h;

    .line 474
    .line 475
    instance-of v2, v2, Ly6/j;

    .line 476
    .line 477
    if-nez v2, :cond_19

    .line 478
    .line 479
    :cond_18
    new-instance v2, Lp4/s;

    .line 480
    .line 481
    invoke-direct {v2}, Lp4/s;-><init>()V

    .line 482
    .line 483
    .line 484
    const/4 v3, 0x1

    .line 485
    invoke-virtual {v1, v3, v2}, Ly6/w;->b(ILp4/s;)V

    .line 486
    .line 487
    .line 488
    :cond_19
    add-int/lit8 v4, v4, 0x1

    .line 489
    .line 490
    const/16 v20, 0x1

    .line 491
    .line 492
    goto :goto_b

    .line 493
    :cond_1a
    return v9

    .line 494
    :cond_1b
    add-int/2addr v5, v8

    .line 495
    invoke-virtual {v2, v5}, Lp4/s;->F(I)V

    .line 496
    .line 497
    .line 498
    const/16 v20, 0x1

    .line 499
    .line 500
    goto :goto_a

    .line 501
    :cond_1c
    iget v3, v2, Lp4/s;->b:I

    .line 502
    .line 503
    iget v4, v2, Lp4/s;->c:I

    .line 504
    .line 505
    iget-object v5, v2, Lp4/s;->a:[B

    .line 506
    .line 507
    move v6, v3

    .line 508
    :goto_c
    if-ge v6, v4, :cond_1d

    .line 509
    .line 510
    aget-byte v8, v5, v6

    .line 511
    .line 512
    const/16 v9, 0x47

    .line 513
    .line 514
    if-eq v8, v9, :cond_1d

    .line 515
    .line 516
    add-int/lit8 v6, v6, 0x1

    .line 517
    .line 518
    goto :goto_c

    .line 519
    :cond_1d
    invoke-virtual {v2, v6}, Lp4/s;->G(I)V

    .line 520
    .line 521
    .line 522
    add-int/lit16 v5, v6, 0xbc

    .line 523
    .line 524
    const/4 v8, 0x0

    .line 525
    if-le v5, v4, :cond_1f

    .line 526
    .line 527
    iget v4, v0, Ly6/d0;->s:I

    .line 528
    .line 529
    sub-int/2addr v6, v3

    .line 530
    add-int/2addr v6, v4

    .line 531
    iput v6, v0, Ly6/d0;->s:I

    .line 532
    .line 533
    move/from16 v10, v25

    .line 534
    .line 535
    const/4 v3, 0x2

    .line 536
    if-ne v10, v3, :cond_20

    .line 537
    .line 538
    const/16 v4, 0x178

    .line 539
    .line 540
    if-gt v6, v4, :cond_1e

    .line 541
    .line 542
    goto :goto_d

    .line 543
    :cond_1e
    const-string v1, "Cannot find sync byte. Most likely not a Transport Stream."

    .line 544
    .line 545
    invoke-static {v8, v1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    throw v1

    .line 550
    :cond_1f
    move/from16 v10, v25

    .line 551
    .line 552
    const/4 v3, 0x2

    .line 553
    iput v1, v0, Ly6/d0;->s:I

    .line 554
    .line 555
    :cond_20
    :goto_d
    iget v4, v2, Lp4/s;->c:I

    .line 556
    .line 557
    if-le v5, v4, :cond_21

    .line 558
    .line 559
    return v1

    .line 560
    :cond_21
    invoke-virtual {v2}, Lp4/s;->g()I

    .line 561
    .line 562
    .line 563
    move-result v6

    .line 564
    const/high16 v9, 0x800000

    .line 565
    .line 566
    and-int/2addr v9, v6

    .line 567
    if-eqz v9, :cond_22

    .line 568
    .line 569
    invoke-virtual {v2, v5}, Lp4/s;->G(I)V

    .line 570
    .line 571
    .line 572
    return v1

    .line 573
    :cond_22
    const/high16 v9, 0x400000

    .line 574
    .line 575
    and-int/2addr v9, v6

    .line 576
    if-eqz v9, :cond_23

    .line 577
    .line 578
    const/4 v9, 0x1

    .line 579
    goto :goto_e

    .line 580
    :cond_23
    const/4 v9, 0x0

    .line 581
    :goto_e
    const v11, 0x1fff00

    .line 582
    .line 583
    .line 584
    and-int/2addr v11, v6

    .line 585
    shr-int/lit8 v11, v11, 0x8

    .line 586
    .line 587
    and-int/lit8 v14, v6, 0x20

    .line 588
    .line 589
    if-eqz v14, :cond_24

    .line 590
    .line 591
    const/4 v14, 0x1

    .line 592
    goto :goto_f

    .line 593
    :cond_24
    const/4 v14, 0x0

    .line 594
    :goto_f
    and-int/lit8 v15, v6, 0x10

    .line 595
    .line 596
    if-eqz v15, :cond_25

    .line 597
    .line 598
    invoke-virtual {v7, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    move-object v8, v7

    .line 603
    check-cast v8, Ly6/f0;

    .line 604
    .line 605
    :cond_25
    if-nez v8, :cond_26

    .line 606
    .line 607
    invoke-virtual {v2, v5}, Lp4/s;->G(I)V

    .line 608
    .line 609
    .line 610
    return v1

    .line 611
    :cond_26
    if-eq v10, v3, :cond_28

    .line 612
    .line 613
    and-int/lit8 v6, v6, 0xf

    .line 614
    .line 615
    add-int/lit8 v7, v6, -0x1

    .line 616
    .line 617
    iget-object v15, v0, Ly6/d0;->e:Landroid/util/SparseIntArray;

    .line 618
    .line 619
    invoke-virtual {v15, v11, v7}, Landroid/util/SparseIntArray;->get(II)I

    .line 620
    .line 621
    .line 622
    move-result v7

    .line 623
    invoke-virtual {v15, v11, v6}, Landroid/util/SparseIntArray;->put(II)V

    .line 624
    .line 625
    .line 626
    if-ne v7, v6, :cond_27

    .line 627
    .line 628
    invoke-virtual {v2, v5}, Lp4/s;->G(I)V

    .line 629
    .line 630
    .line 631
    return v1

    .line 632
    :cond_27
    const/16 v20, 0x1

    .line 633
    .line 634
    add-int/lit8 v7, v7, 0x1

    .line 635
    .line 636
    and-int/lit8 v7, v7, 0xf

    .line 637
    .line 638
    if-eq v6, v7, :cond_28

    .line 639
    .line 640
    invoke-interface {v8}, Ly6/f0;->a()V

    .line 641
    .line 642
    .line 643
    :cond_28
    if-eqz v14, :cond_2a

    .line 644
    .line 645
    invoke-virtual {v2}, Lp4/s;->u()I

    .line 646
    .line 647
    .line 648
    move-result v6

    .line 649
    invoke-virtual {v2}, Lp4/s;->u()I

    .line 650
    .line 651
    .line 652
    move-result v7

    .line 653
    and-int/lit8 v7, v7, 0x40

    .line 654
    .line 655
    if-eqz v7, :cond_29

    .line 656
    .line 657
    const/4 v7, 0x2

    .line 658
    goto :goto_10

    .line 659
    :cond_29
    const/4 v7, 0x0

    .line 660
    :goto_10
    or-int/2addr v9, v7

    .line 661
    const/16 v20, 0x1

    .line 662
    .line 663
    add-int/lit8 v6, v6, -0x1

    .line 664
    .line 665
    invoke-virtual {v2, v6}, Lp4/s;->H(I)V

    .line 666
    .line 667
    .line 668
    :cond_2a
    iget-boolean v6, v0, Ly6/d0;->o:Z

    .line 669
    .line 670
    if-eq v10, v3, :cond_2b

    .line 671
    .line 672
    if-nez v6, :cond_2b

    .line 673
    .line 674
    iget-object v7, v0, Ly6/d0;->j:Landroid/util/SparseBooleanArray;

    .line 675
    .line 676
    invoke-virtual {v7, v11, v1}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 677
    .line 678
    .line 679
    move-result v7

    .line 680
    if-nez v7, :cond_2c

    .line 681
    .line 682
    :cond_2b
    invoke-virtual {v2, v5}, Lp4/s;->F(I)V

    .line 683
    .line 684
    .line 685
    invoke-interface {v8, v9, v2}, Ly6/f0;->b(ILp4/s;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v2, v4}, Lp4/s;->F(I)V

    .line 689
    .line 690
    .line 691
    :cond_2c
    if-eq v10, v3, :cond_2d

    .line 692
    .line 693
    if-nez v6, :cond_2d

    .line 694
    .line 695
    iget-boolean v3, v0, Ly6/d0;->o:Z

    .line 696
    .line 697
    if-eqz v3, :cond_2d

    .line 698
    .line 699
    cmp-long v3, v12, v18

    .line 700
    .line 701
    if-eqz v3, :cond_2d

    .line 702
    .line 703
    const/4 v3, 0x1

    .line 704
    iput-boolean v3, v0, Ly6/d0;->q:Z

    .line 705
    .line 706
    :cond_2d
    invoke-virtual {v2, v5}, Lp4/s;->G(I)V

    .line 707
    .line 708
    .line 709
    return v1
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
.end method

.method public final h(Lr5/q;)V
    .locals 2

    .line 1
    iget v0, p0, Ly6/d0;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lb5/d0;

    .line 8
    .line 9
    iget-object v1, p0, Ly6/d0;->g:Lo6/j;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lb5/d0;-><init>(Lr5/q;Lo6/j;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iput-object p1, p0, Ly6/d0;->m:Lr5/q;

    .line 16
    .line 17
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final i(JJ)V
    .locals 11

    .line 1
    iget p1, p0, Ly6/d0;->a:I

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eq p1, p2, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    invoke-static {p1}, Lp4/c;->i(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Ly6/d0;->c:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_1
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    if-ge v2, p2, :cond_5

    .line 24
    .line 25
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Lp4/y;

    .line 30
    .line 31
    invoke-virtual {v5}, Lp4/y;->e()J

    .line 32
    .line 33
    .line 34
    move-result-wide v6

    .line 35
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    cmp-long v10, v6, v8

    .line 41
    .line 42
    if-nez v10, :cond_1

    .line 43
    .line 44
    const/4 v6, 0x1

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const/4 v6, 0x0

    .line 47
    :goto_2
    if-nez v6, :cond_3

    .line 48
    .line 49
    invoke-virtual {v5}, Lp4/y;->d()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    cmp-long v10, v6, v8

    .line 54
    .line 55
    if-eqz v10, :cond_2

    .line 56
    .line 57
    cmp-long v8, v6, v3

    .line 58
    .line 59
    if-eqz v8, :cond_2

    .line 60
    .line 61
    cmp-long v3, v6, p3

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    const/4 v6, 0x1

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    const/4 v6, 0x0

    .line 68
    :cond_3
    :goto_3
    if-eqz v6, :cond_4

    .line 69
    .line 70
    invoke-virtual {v5, p3, p4}, Lp4/y;->g(J)V

    .line 71
    .line 72
    .line 73
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    cmp-long p1, p3, v3

    .line 77
    .line 78
    if-eqz p1, :cond_6

    .line 79
    .line 80
    iget-object p1, p0, Ly6/d0;->l:Lw5/a;

    .line 81
    .line 82
    if-eqz p1, :cond_6

    .line 83
    .line 84
    invoke-virtual {p1, p3, p4}, Lw5/a;->d(J)V

    .line 85
    .line 86
    .line 87
    :cond_6
    iget-object p1, p0, Ly6/d0;->d:Lp4/s;

    .line 88
    .line 89
    invoke-virtual {p1, v1}, Lp4/s;->D(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Ly6/d0;->e:Landroid/util/SparseIntArray;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 95
    .line 96
    .line 97
    const/4 p1, 0x0

    .line 98
    :goto_4
    iget-object p2, p0, Ly6/d0;->h:Landroid/util/SparseArray;

    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    if-ge p1, p3, :cond_7

    .line 105
    .line 106
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    check-cast p2, Ly6/f0;

    .line 111
    .line 112
    invoke-interface {p2}, Ly6/f0;->a()V

    .line 113
    .line 114
    .line 115
    add-int/lit8 p1, p1, 0x1

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_7
    iput v1, p0, Ly6/d0;->s:I

    .line 119
    .line 120
    return-void
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lya/i0;->b:Lya/g0;

    .line 2
    .line 3
    sget-object v0, Lya/a1;->e:Lya/a1;

    .line 4
    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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
