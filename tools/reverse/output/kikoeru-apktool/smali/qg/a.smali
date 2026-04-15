.class public final Lqg/a;
.super Lqg/b;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public e:[B

.field public f:[B

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I


# virtual methods
.method public final b(Ljava/io/InputStream;I)V
    .locals 3

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    invoke-static {p1, v1}, Ln7/d;->x(Ljava/io/InputStream;[B)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-ne p1, v0, :cond_2

    .line 10
    .line 11
    iget-object p1, p0, Lqg/b;->b:Llg/b;

    .line 12
    .line 13
    check-cast p1, Llg/a;

    .line 14
    .line 15
    iget-object p1, p1, Llg/a;->b:Lah/j;

    .line 16
    .line 17
    iget-object v2, p1, Lah/j;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ljava/io/ByteArrayOutputStream;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-lez v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Lah/j;->i(I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p1, p1, Lah/j;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Ljavax/crypto/Mac;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljavax/crypto/Mac;->doFinal()[B

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-array p2, v0, [B

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {p1, v2, p2, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 42
    .line 43
    .line 44
    invoke-static {v1, p2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 52
    .line 53
    const-string p2, "Reached end of data for this entry, but aes verification failed"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    new-instance p1, Log/a;

    .line 60
    .line 61
    const-string p2, "Invalid AES Mac bytes. Could not read sufficient data"

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
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

.method public final g(Lrg/f;[CZ)Llg/b;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Llg/a;

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    iget-object v3, v3, Lrg/b;->B:Lrg/a;

    .line 10
    .line 11
    if-eqz v3, :cond_17

    .line 12
    .line 13
    iget v4, v3, Lrg/a;->p:I

    .line 14
    .line 15
    if-eqz v4, :cond_16

    .line 16
    .line 17
    invoke-static {v4}, Lq/t0;->u(I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    new-array v5, v4, [B

    .line 22
    .line 23
    invoke-virtual {v0, v5}, Lqg/b;->i([B)V

    .line 24
    .line 25
    .line 26
    const/4 v6, 0x2

    .line 27
    new-array v7, v6, [B

    .line 28
    .line 29
    invoke-virtual {v0, v7}, Lqg/b;->i([B)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    const/4 v8, 0x1

    .line 36
    iput v8, v2, Llg/a;->c:I

    .line 37
    .line 38
    const/16 v9, 0x10

    .line 39
    .line 40
    new-array v10, v9, [B

    .line 41
    .line 42
    iput-object v10, v2, Llg/a;->d:[B

    .line 43
    .line 44
    new-array v10, v9, [B

    .line 45
    .line 46
    iput-object v10, v2, Llg/a;->e:[B

    .line 47
    .line 48
    if-eqz v1, :cond_15

    .line 49
    .line 50
    array-length v10, v1

    .line 51
    if-lez v10, :cond_15

    .line 52
    .line 53
    iget v3, v3, Lrg/a;->p:I

    .line 54
    .line 55
    const/16 v10, 0x20

    .line 56
    .line 57
    const/4 v12, 0x0

    .line 58
    const/4 v13, 0x3

    .line 59
    if-eq v3, v8, :cond_2

    .line 60
    .line 61
    if-eq v3, v6, :cond_1

    .line 62
    .line 63
    if-ne v3, v13, :cond_0

    .line 64
    .line 65
    const/16 v14, 0x20

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    throw v12

    .line 69
    :cond_1
    const/16 v14, 0x18

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const/16 v14, 0x10

    .line 73
    .line 74
    :goto_0
    if-eq v3, v8, :cond_5

    .line 75
    .line 76
    if-eq v3, v6, :cond_4

    .line 77
    .line 78
    if-ne v3, v13, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    throw v12

    .line 82
    :cond_4
    const/16 v10, 0x18

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    const/16 v10, 0x10

    .line 86
    .line 87
    :goto_1
    add-int v3, v14, v10

    .line 88
    .line 89
    add-int/lit8 v15, v3, 0x2

    .line 90
    .line 91
    invoke-static/range {p2 .. p3}, Ln7/d;->g([CZ)[B

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const/16 p1, 0x1

    .line 96
    .line 97
    new-instance v8, Lah/j;

    .line 98
    .line 99
    const/16 v16, 0x10

    .line 100
    .line 101
    const/4 v9, 0x0

    .line 102
    const/16 v17, 0x18

    .line 103
    .line 104
    const/16 v11, 0xb

    .line 105
    .line 106
    invoke-direct {v8, v9, v11}, Lah/j;-><init>(BI)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8, v1}, Lah/j;->x([B)V

    .line 110
    .line 111
    .line 112
    if-nez v15, :cond_6

    .line 113
    .line 114
    iget v1, v8, Lah/j;->b:I

    .line 115
    .line 116
    :goto_2
    const/16 v18, 0x3

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    move v1, v15

    .line 120
    goto :goto_2

    .line 121
    :goto_3
    iget v13, v8, Lah/j;->b:I

    .line 122
    .line 123
    rem-int v19, v1, v13

    .line 124
    .line 125
    if-lez v19, :cond_7

    .line 126
    .line 127
    const/16 v19, 0x1

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_7
    const/16 v19, 0x0

    .line 131
    .line 132
    :goto_4
    div-int v20, v1, v13

    .line 133
    .line 134
    add-int v11, v20, v19

    .line 135
    .line 136
    add-int/lit8 v19, v11, -0x1

    .line 137
    .line 138
    mul-int v19, v19, v13

    .line 139
    .line 140
    sub-int v12, v1, v19

    .line 141
    .line 142
    mul-int v6, v11, v13

    .line 143
    .line 144
    new-array v6, v6, [B

    .line 145
    .line 146
    const/4 v0, 0x0

    .line 147
    const/4 v9, 0x1

    .line 148
    :goto_5
    if-gt v9, v11, :cond_b

    .line 149
    .line 150
    move/from16 v21, v11

    .line 151
    .line 152
    iget v11, v8, Lah/j;->b:I

    .line 153
    .line 154
    move/from16 v22, v10

    .line 155
    .line 156
    new-array v10, v11, [B

    .line 157
    .line 158
    move-object/from16 v23, v2

    .line 159
    .line 160
    add-int/lit8 v2, v4, 0x4

    .line 161
    .line 162
    new-array v2, v2, [B

    .line 163
    .line 164
    move/from16 v24, v14

    .line 165
    .line 166
    const/4 v14, 0x0

    .line 167
    invoke-static {v5, v14, v2, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 168
    .line 169
    .line 170
    const/high16 v14, 0x1000000

    .line 171
    .line 172
    div-int v14, v9, v14

    .line 173
    .line 174
    int-to-byte v14, v14

    .line 175
    aput-byte v14, v2, v4

    .line 176
    .line 177
    add-int/lit8 v14, v4, 0x1

    .line 178
    .line 179
    const/high16 v25, 0x10000

    .line 180
    .line 181
    move-object/from16 v26, v2

    .line 182
    .line 183
    div-int v2, v9, v25

    .line 184
    .line 185
    int-to-byte v2, v2

    .line 186
    aput-byte v2, v26, v14

    .line 187
    .line 188
    add-int/lit8 v2, v4, 0x2

    .line 189
    .line 190
    div-int/lit16 v14, v9, 0x100

    .line 191
    .line 192
    int-to-byte v14, v14

    .line 193
    aput-byte v14, v26, v2

    .line 194
    .line 195
    add-int/lit8 v2, v4, 0x3

    .line 196
    .line 197
    int-to-byte v14, v9

    .line 198
    aput-byte v14, v26, v2

    .line 199
    .line 200
    move/from16 v25, v4

    .line 201
    .line 202
    move-object/from16 v14, v26

    .line 203
    .line 204
    const/4 v2, 0x0

    .line 205
    :goto_6
    const/16 v4, 0x3e8

    .line 206
    .line 207
    if-ge v2, v4, :cond_a

    .line 208
    .line 209
    iget-object v4, v8, Lah/j;->d:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v4, Ljava/io/ByteArrayOutputStream;

    .line 212
    .line 213
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    if-lez v4, :cond_8

    .line 218
    .line 219
    const/4 v4, 0x0

    .line 220
    invoke-virtual {v8, v4}, Lah/j;->i(I)V

    .line 221
    .line 222
    .line 223
    :cond_8
    iget-object v4, v8, Lah/j;->c:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v4, Ljavax/crypto/Mac;

    .line 226
    .line 227
    invoke-virtual {v4, v14}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 228
    .line 229
    .line 230
    move-result-object v14

    .line 231
    const/4 v4, 0x0

    .line 232
    :goto_7
    if-ge v4, v11, :cond_9

    .line 233
    .line 234
    aget-byte v26, v10, v4

    .line 235
    .line 236
    aget-byte v27, v14, v4

    .line 237
    .line 238
    move/from16 v28, v2

    .line 239
    .line 240
    xor-int v2, v26, v27

    .line 241
    .line 242
    int-to-byte v2, v2

    .line 243
    aput-byte v2, v10, v4

    .line 244
    .line 245
    add-int/lit8 v4, v4, 0x1

    .line 246
    .line 247
    move/from16 v2, v28

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_9
    move/from16 v28, v2

    .line 251
    .line 252
    add-int/lit8 v2, v28, 0x1

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_a
    const/4 v14, 0x0

    .line 256
    invoke-static {v10, v14, v6, v0, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 257
    .line 258
    .line 259
    add-int/2addr v0, v13

    .line 260
    add-int/lit8 v9, v9, 0x1

    .line 261
    .line 262
    move/from16 v11, v21

    .line 263
    .line 264
    move/from16 v10, v22

    .line 265
    .line 266
    move-object/from16 v2, v23

    .line 267
    .line 268
    move/from16 v14, v24

    .line 269
    .line 270
    move/from16 v4, v25

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_b
    move-object/from16 v23, v2

    .line 274
    .line 275
    move/from16 v22, v10

    .line 276
    .line 277
    move/from16 v24, v14

    .line 278
    .line 279
    const/4 v14, 0x0

    .line 280
    if-ge v12, v13, :cond_c

    .line 281
    .line 282
    new-array v0, v1, [B

    .line 283
    .line 284
    invoke-static {v6, v14, v0, v14, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 285
    .line 286
    .line 287
    move-object v6, v0

    .line 288
    :cond_c
    array-length v0, v6

    .line 289
    if-ne v0, v15, :cond_14

    .line 290
    .line 291
    const/4 v0, 0x2

    .line 292
    new-array v1, v0, [B

    .line 293
    .line 294
    invoke-static {v6, v3, v1, v14, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 295
    .line 296
    .line 297
    invoke-static {v7, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_13

    .line 302
    .line 303
    move/from16 v9, v24

    .line 304
    .line 305
    new-array v0, v9, [B

    .line 306
    .line 307
    invoke-static {v6, v14, v0, v14, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 308
    .line 309
    .line 310
    new-instance v1, Lng/a;

    .line 311
    .line 312
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 313
    .line 314
    .line 315
    const/4 v2, 0x0

    .line 316
    iput-object v2, v1, Lng/a;->b:[[I

    .line 317
    .line 318
    div-int/lit8 v14, v9, 0x4

    .line 319
    .line 320
    const/4 v2, 0x4

    .line 321
    const/16 v3, 0x8

    .line 322
    .line 323
    const/4 v4, 0x6

    .line 324
    if-eq v14, v2, :cond_d

    .line 325
    .line 326
    if-eq v14, v4, :cond_d

    .line 327
    .line 328
    if-ne v14, v3, :cond_12

    .line 329
    .line 330
    :cond_d
    mul-int/lit8 v5, v14, 0x4

    .line 331
    .line 332
    if-ne v5, v9, :cond_12

    .line 333
    .line 334
    add-int/lit8 v5, v14, 0x6

    .line 335
    .line 336
    iput v5, v1, Lng/a;->a:I

    .line 337
    .line 338
    add-int/lit8 v5, v14, 0x7

    .line 339
    .line 340
    const/4 v7, 0x2

    .line 341
    new-array v8, v7, [I

    .line 342
    .line 343
    aput v2, v8, p1

    .line 344
    .line 345
    const/4 v7, 0x0

    .line 346
    aput v5, v8, v7

    .line 347
    .line 348
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 349
    .line 350
    invoke-static {v5, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    check-cast v5, [[I

    .line 355
    .line 356
    const/4 v7, 0x0

    .line 357
    const/4 v8, 0x0

    .line 358
    :goto_8
    if-ge v7, v9, :cond_e

    .line 359
    .line 360
    shr-int/lit8 v10, v8, 0x2

    .line 361
    .line 362
    aget-object v10, v5, v10

    .line 363
    .line 364
    and-int/lit8 v11, v8, 0x3

    .line 365
    .line 366
    aget-byte v12, v0, v7

    .line 367
    .line 368
    and-int/lit16 v12, v12, 0xff

    .line 369
    .line 370
    add-int/lit8 v13, v7, 0x1

    .line 371
    .line 372
    aget-byte v13, v0, v13

    .line 373
    .line 374
    and-int/lit16 v13, v13, 0xff

    .line 375
    .line 376
    shl-int/2addr v13, v3

    .line 377
    or-int/2addr v12, v13

    .line 378
    add-int/lit8 v13, v7, 0x2

    .line 379
    .line 380
    aget-byte v13, v0, v13

    .line 381
    .line 382
    and-int/lit16 v13, v13, 0xff

    .line 383
    .line 384
    shl-int/lit8 v13, v13, 0x10

    .line 385
    .line 386
    or-int/2addr v12, v13

    .line 387
    add-int/lit8 v13, v7, 0x3

    .line 388
    .line 389
    aget-byte v13, v0, v13

    .line 390
    .line 391
    shl-int/lit8 v13, v13, 0x18

    .line 392
    .line 393
    or-int/2addr v12, v13

    .line 394
    aput v12, v10, v11

    .line 395
    .line 396
    add-int/lit8 v7, v7, 0x4

    .line 397
    .line 398
    add-int/lit8 v8, v8, 0x1

    .line 399
    .line 400
    goto :goto_8

    .line 401
    :cond_e
    iget v0, v1, Lng/a;->a:I

    .line 402
    .line 403
    add-int/lit8 v0, v0, 0x1

    .line 404
    .line 405
    const/16 v19, 0x2

    .line 406
    .line 407
    shl-int/lit8 v0, v0, 0x2

    .line 408
    .line 409
    move v7, v14

    .line 410
    :goto_9
    if-ge v7, v0, :cond_11

    .line 411
    .line 412
    add-int/lit8 v8, v7, -0x1

    .line 413
    .line 414
    shr-int/lit8 v10, v8, 0x2

    .line 415
    .line 416
    aget-object v10, v5, v10

    .line 417
    .line 418
    and-int/lit8 v8, v8, 0x3

    .line 419
    .line 420
    aget v8, v10, v8

    .line 421
    .line 422
    rem-int v10, v7, v14

    .line 423
    .line 424
    if-nez v10, :cond_f

    .line 425
    .line 426
    invoke-static {v8, v3}, Lng/a;->a(II)I

    .line 427
    .line 428
    .line 429
    move-result v8

    .line 430
    invoke-static {v8}, Lng/a;->b(I)I

    .line 431
    .line 432
    .line 433
    move-result v8

    .line 434
    div-int v10, v7, v14

    .line 435
    .line 436
    add-int/lit8 v10, v10, -0x1

    .line 437
    .line 438
    sget-object v11, Lng/a;->h:[I

    .line 439
    .line 440
    aget v10, v11, v10

    .line 441
    .line 442
    xor-int/2addr v8, v10

    .line 443
    goto :goto_a

    .line 444
    :cond_f
    if-le v14, v4, :cond_10

    .line 445
    .line 446
    if-ne v10, v2, :cond_10

    .line 447
    .line 448
    invoke-static {v8}, Lng/a;->b(I)I

    .line 449
    .line 450
    .line 451
    move-result v8

    .line 452
    :cond_10
    :goto_a
    shr-int/lit8 v10, v7, 0x2

    .line 453
    .line 454
    aget-object v10, v5, v10

    .line 455
    .line 456
    and-int/lit8 v11, v7, 0x3

    .line 457
    .line 458
    sub-int v12, v7, v14

    .line 459
    .line 460
    shr-int/lit8 v13, v12, 0x2

    .line 461
    .line 462
    aget-object v13, v5, v13

    .line 463
    .line 464
    and-int/lit8 v12, v12, 0x3

    .line 465
    .line 466
    aget v12, v13, v12

    .line 467
    .line 468
    xor-int/2addr v8, v12

    .line 469
    aput v8, v10, v11

    .line 470
    .line 471
    add-int/lit8 v7, v7, 0x1

    .line 472
    .line 473
    goto :goto_9

    .line 474
    :cond_11
    iput-object v5, v1, Lng/a;->b:[[I

    .line 475
    .line 476
    move-object/from16 v0, v23

    .line 477
    .line 478
    iput-object v1, v0, Llg/a;->a:Lng/a;

    .line 479
    .line 480
    move/from16 v10, v22

    .line 481
    .line 482
    new-array v1, v10, [B

    .line 483
    .line 484
    const/4 v14, 0x0

    .line 485
    invoke-static {v6, v9, v1, v14, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 486
    .line 487
    .line 488
    new-instance v2, Lah/j;

    .line 489
    .line 490
    const/16 v3, 0xb

    .line 491
    .line 492
    invoke-direct {v2, v14, v3}, Lah/j;-><init>(BI)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2, v1}, Lah/j;->x([B)V

    .line 496
    .line 497
    .line 498
    iput-object v2, v0, Llg/a;->b:Lah/j;

    .line 499
    .line 500
    return-object v0

    .line 501
    :cond_12
    new-instance v0, Log/a;

    .line 502
    .line 503
    const-string v1, "invalid key length (not 128/192/256)"

    .line 504
    .line 505
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    throw v0

    .line 509
    :cond_13
    new-instance v0, Log/a;

    .line 510
    .line 511
    const-string v1, "Wrong Password"

    .line 512
    .line 513
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    throw v0

    .line 517
    :cond_14
    move/from16 v10, v22

    .line 518
    .line 519
    move/from16 v9, v24

    .line 520
    .line 521
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    const/4 v7, 0x2

    .line 530
    new-array v2, v7, [Ljava/lang/Object;

    .line 531
    .line 532
    const/4 v14, 0x0

    .line 533
    aput-object v0, v2, v14

    .line 534
    .line 535
    aput-object v1, v2, p1

    .line 536
    .line 537
    const-string v0, "Derived Key invalid for Key Length [%d] MAC Length [%d]"

    .line 538
    .line 539
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    new-instance v1, Log/a;

    .line 544
    .line 545
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    throw v1

    .line 549
    :cond_15
    new-instance v0, Log/a;

    .line 550
    .line 551
    const-string v1, "empty or null password provided for AES decryption"

    .line 552
    .line 553
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    throw v0

    .line 557
    :cond_16
    new-instance v0, Ljava/io/IOException;

    .line 558
    .line 559
    const-string v1, "Invalid aes key strength in aes extra data record"

    .line 560
    .line 561
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    throw v0

    .line 565
    :cond_17
    new-instance v0, Ljava/io/IOException;

    .line 566
    .line 567
    const-string v1, "invalid aes extra data record"

    .line 568
    .line 569
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    throw v0
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
.end method

.method public final k([BI)V
    .locals 3

    .line 1
    iget v0, p0, Lqg/a;->i:I

    .line 2
    .line 3
    iget v1, p0, Lqg/a;->h:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v0, v1

    .line 9
    :goto_0
    iput v0, p0, Lqg/a;->l:I

    .line 10
    .line 11
    iget-object v1, p0, Lqg/a;->f:[B

    .line 12
    .line 13
    iget v2, p0, Lqg/a;->g:I

    .line 14
    .line 15
    invoke-static {v1, v2, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Lqg/a;->l:I

    .line 19
    .line 20
    iget p2, p0, Lqg/a;->g:I

    .line 21
    .line 22
    add-int/2addr p2, p1

    .line 23
    iput p2, p0, Lqg/a;->g:I

    .line 24
    .line 25
    const/16 v0, 0xf

    .line 26
    .line 27
    if-lt p2, v0, :cond_1

    .line 28
    .line 29
    iput v0, p0, Lqg/a;->g:I

    .line 30
    .line 31
    :cond_1
    iget p2, p0, Lqg/a;->h:I

    .line 32
    .line 33
    sub-int/2addr p2, p1

    .line 34
    iput p2, p0, Lqg/a;->h:I

    .line 35
    .line 36
    if-gtz p2, :cond_2

    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    iput p2, p0, Lqg/a;->h:I

    .line 40
    .line 41
    :cond_2
    iget p2, p0, Lqg/a;->k:I

    .line 42
    .line 43
    add-int/2addr p2, p1

    .line 44
    iput p2, p0, Lqg/a;->k:I

    .line 45
    .line 46
    iget p2, p0, Lqg/a;->i:I

    .line 47
    .line 48
    sub-int/2addr p2, p1

    .line 49
    iput p2, p0, Lqg/a;->i:I

    .line 50
    .line 51
    iget p2, p0, Lqg/a;->j:I

    .line 52
    .line 53
    add-int/2addr p2, p1

    .line 54
    iput p2, p0, Lqg/a;->j:I

    .line 55
    .line 56
    return-void
    .line 57
    .line 58
.end method

.method public final read()I
    .locals 4

    .line 1
    iget-object v0, p0, Lqg/a;->e:[B

    .line 2
    array-length v1, v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, Lqg/a;->read([BII)I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    return v3

    .line 3
    :cond_0
    aget-byte v0, v0, v2

    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 4
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lqg/a;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 3

    .line 5
    iput p3, p0, Lqg/a;->i:I

    .line 6
    iput p2, p0, Lqg/a;->j:I

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lqg/a;->k:I

    .line 8
    iget v1, p0, Lqg/a;->h:I

    if-eqz v1, :cond_0

    .line 9
    invoke-virtual {p0, p1, p2}, Lqg/a;->k([BI)V

    .line 10
    iget p2, p0, Lqg/a;->k:I

    if-ne p2, p3, :cond_0

    return p2

    .line 11
    :cond_0
    iget p2, p0, Lqg/a;->i:I

    const/16 v1, 0x10

    const/4 v2, -0x1

    if-ge p2, v1, :cond_2

    .line 12
    iget-object p2, p0, Lqg/a;->f:[B

    array-length v1, p2

    invoke-super {p0, p2, v0, v1}, Lqg/b;->read([BII)I

    move-result p2

    .line 13
    iput v0, p0, Lqg/a;->g:I

    if-ne p2, v2, :cond_1

    .line 14
    iput v0, p0, Lqg/a;->h:I

    .line 15
    iget p1, p0, Lqg/a;->k:I

    if-lez p1, :cond_3

    return p1

    .line 16
    :cond_1
    iput p2, p0, Lqg/a;->h:I

    .line 17
    iget p2, p0, Lqg/a;->j:I

    invoke-virtual {p0, p1, p2}, Lqg/a;->k([BI)V

    .line 18
    iget p2, p0, Lqg/a;->k:I

    if-ne p2, p3, :cond_2

    return p2

    .line 19
    :cond_2
    iget p2, p0, Lqg/a;->j:I

    iget p3, p0, Lqg/a;->i:I

    rem-int/lit8 v0, p3, 0x10

    sub-int/2addr p3, v0

    invoke-super {p0, p1, p2, p3}, Lqg/b;->read([BII)I

    move-result p1

    if-ne p1, v2, :cond_4

    .line 20
    iget p1, p0, Lqg/a;->k:I

    if-lez p1, :cond_3

    return p1

    :cond_3
    return v2

    .line 21
    :cond_4
    iget p2, p0, Lqg/a;->k:I

    add-int/2addr p1, p2

    return p1
.end method
