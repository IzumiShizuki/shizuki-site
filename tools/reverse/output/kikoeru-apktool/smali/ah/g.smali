.class public abstract Lah/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Llh/i;->d:Llh/i;

    .line 2
    .line 3
    const-string v0, "\"\\"

    .line 4
    .line 5
    invoke-static {v0}, Lg5/w;->t(Ljava/lang/String;)Llh/i;

    .line 6
    .line 7
    .line 8
    const-string v0, "\t ,="

    .line 9
    .line 10
    invoke-static {v0}, Lg5/w;->t(Ljava/lang/String;)Llh/i;

    .line 11
    .line 12
    .line 13
    return-void
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

.method public static final a(Lug/d0;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lug/d0;->a:Lb7/b1;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/b1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "HEAD"

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v0, p0, Lug/d0;->d:I

    .line 17
    .line 18
    const/16 v1, 0x64

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    const/16 v1, 0xc8

    .line 23
    .line 24
    if-lt v0, v1, :cond_2

    .line 25
    .line 26
    :cond_1
    const/16 v1, 0xcc

    .line 27
    .line 28
    if-eq v0, v1, :cond_2

    .line 29
    .line 30
    const/16 v1, 0x130

    .line 31
    .line 32
    if-eq v0, v1, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {p0}, Lwg/g;->d(Lug/d0;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    const-wide/16 v2, -0x1

    .line 40
    .line 41
    cmp-long v4, v0, v2

    .line 42
    .line 43
    if-nez v4, :cond_5

    .line 44
    .line 45
    iget-object p0, p0, Lug/d0;->f:Lug/r;

    .line 46
    .line 47
    const-string v0, "Transfer-Encoding"

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-nez p0, :cond_3

    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    :cond_3
    const-string v0, "chunked"

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_4

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 66
    return p0

    .line 67
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 68
    return p0
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

.method public static final b(Lug/b;Lug/t;Lug/r;)V
    .locals 35

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
    const-string v3, "<this>"

    .line 8
    .line 9
    invoke-static {v0, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "url"

    .line 13
    .line 14
    invoke-static {v1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "headers"

    .line 18
    .line 19
    invoke-static {v2, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object v3, Lug/b;->d:Lug/b;

    .line 23
    .line 24
    if-ne v0, v3, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object v0, Lug/o;->k:Ljava/util/regex/Pattern;

    .line 28
    .line 29
    const-string v0, "Set-Cookie"

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Lug/r;->l(Ljava/lang/String;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    :goto_0
    if-ge v6, v3, :cond_21

    .line 43
    .line 44
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    move-object v8, v0

    .line 49
    check-cast v8, Ljava/lang/String;

    .line 50
    .line 51
    const-string v0, "setCookie"

    .line 52
    .line 53
    invoke-static {v8, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v9

    .line 60
    sget-object v0, Lwg/e;->a:[B

    .line 61
    .line 62
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/16 v11, 0x3b

    .line 67
    .line 68
    invoke-static {v8, v11, v4, v0}, Lwg/e;->e(Ljava/lang/String;CII)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const/16 v12, 0x3d

    .line 73
    .line 74
    invoke-static {v8, v12, v4, v0}, Lwg/e;->e(Ljava/lang/String;CII)I

    .line 75
    .line 76
    .line 77
    move-result v13

    .line 78
    if-ne v13, v0, :cond_1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-static {v4, v13, v8}, Lwg/e;->p(IILjava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v15

    .line 85
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    if-nez v14, :cond_2

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    invoke-static {v15}, Lwg/e;->h(Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    const/4 v5, -0x1

    .line 97
    if-eq v14, v5, :cond_3

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    add-int/lit8 v13, v13, 0x1

    .line 101
    .line 102
    invoke-static {v13, v0, v8}, Lwg/e;->p(IILjava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v16

    .line 106
    invoke-static/range {v16 .. v16}, Lwg/e;->h(Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v13

    .line 110
    if-eq v13, v5, :cond_5

    .line 111
    .line 112
    :cond_4
    :goto_1
    const/4 v12, 0x0

    .line 113
    const/4 v14, 0x0

    .line 114
    goto/16 :goto_c

    .line 115
    .line 116
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 117
    .line 118
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    const-wide/16 v17, -0x1

    .line 123
    .line 124
    const-wide v19, 0xe677d21fdbffL

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    move-wide/from16 v21, v17

    .line 130
    .line 131
    move-wide/from16 v27, v19

    .line 132
    .line 133
    const/16 p2, 0x1

    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    const/4 v14, 0x0

    .line 137
    const/16 v23, 0x0

    .line 138
    .line 139
    const/16 v24, 0x1

    .line 140
    .line 141
    const/16 v25, 0x0

    .line 142
    .line 143
    const/16 v26, 0x0

    .line 144
    .line 145
    const/16 v29, 0x0

    .line 146
    .line 147
    :goto_2
    const-wide v30, 0x7fffffffffffffffL

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    const-wide/high16 v32, -0x8000000000000000L

    .line 153
    .line 154
    if-ge v0, v5, :cond_13

    .line 155
    .line 156
    invoke-static {v8, v11, v0, v5}, Lwg/e;->e(Ljava/lang/String;CII)I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    invoke-static {v8, v12, v0, v4}, Lwg/e;->e(Ljava/lang/String;CII)I

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    invoke-static {v0, v11, v8}, Lwg/e;->p(IILjava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    if-ge v11, v4, :cond_6

    .line 169
    .line 170
    add-int/lit8 v11, v11, 0x1

    .line 171
    .line 172
    invoke-static {v11, v4, v8}, Lwg/e;->p(IILjava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    goto :goto_3

    .line 177
    :cond_6
    const-string v11, ""

    .line 178
    .line 179
    :goto_3
    const-string v12, "expires"

    .line 180
    .line 181
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    if-eqz v12, :cond_7

    .line 186
    .line 187
    :try_start_0
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    invoke-static {v0, v11}, Lua/l;->V(ILjava/lang/String;)J

    .line 192
    .line 193
    .line 194
    move-result-wide v27
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 195
    :goto_4
    const/16 v25, 0x1

    .line 196
    .line 197
    goto/16 :goto_5

    .line 198
    .line 199
    :cond_7
    const-string v12, "max-age"

    .line 200
    .line 201
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    move-result v12

    .line 205
    if-eqz v12, :cond_b

    .line 206
    .line 207
    :try_start_1
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 208
    .line 209
    .line 210
    move-result-wide v11
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 211
    const-wide/16 v21, 0x0

    .line 212
    .line 213
    cmp-long v0, v11, v21

    .line 214
    .line 215
    if-gtz v0, :cond_8

    .line 216
    .line 217
    move-wide/from16 v21, v32

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_8
    move-wide/from16 v21, v11

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :catch_0
    move-exception v0

    .line 224
    :try_start_2
    const-string v12, "-?\\d+"

    .line 225
    .line 226
    invoke-static {v12}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    move-object/from16 v34, v0

    .line 231
    .line 232
    const-string v0, "compile(...)"

    .line 233
    .line 234
    invoke-static {v12, v0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-eqz v0, :cond_a

    .line 246
    .line 247
    const-string v0, "-"

    .line 248
    .line 249
    const/4 v12, 0x0

    .line 250
    invoke-static {v11, v0, v12}, Lef/u;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_9

    .line 255
    .line 256
    move-wide/from16 v30, v32

    .line 257
    .line 258
    :cond_9
    move-wide/from16 v21, v30

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_a
    throw v34
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 262
    :cond_b
    const-string v12, "domain"

    .line 263
    .line 264
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 265
    .line 266
    .line 267
    move-result v12

    .line 268
    if-eqz v12, :cond_e

    .line 269
    .line 270
    :try_start_3
    const-string v0, "."

    .line 271
    .line 272
    const/4 v12, 0x0

    .line 273
    invoke-static {v11, v0, v12}, Lef/u;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 274
    .line 275
    .line 276
    move-result v30

    .line 277
    if-nez v30, :cond_d

    .line 278
    .line 279
    invoke-static {v11, v0}, Lef/n;->F0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-static {v0}, Lwg/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    if-eqz v0, :cond_c

    .line 288
    .line 289
    move-object v14, v0

    .line 290
    const/16 v24, 0x0

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 294
    .line 295
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 296
    .line 297
    .line 298
    throw v0

    .line 299
    :cond_d
    const-string v0, "Failed requirement."

    .line 300
    .line 301
    new-instance v11, Ljava/lang/IllegalArgumentException;

    .line 302
    .line 303
    invoke-direct {v11, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw v11
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    .line 307
    :cond_e
    const-string v12, "path"

    .line 308
    .line 309
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 310
    .line 311
    .line 312
    move-result v12

    .line 313
    if-eqz v12, :cond_f

    .line 314
    .line 315
    move-object v13, v11

    .line 316
    goto :goto_5

    .line 317
    :cond_f
    const-string v12, "secure"

    .line 318
    .line 319
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 320
    .line 321
    .line 322
    move-result v12

    .line 323
    if-eqz v12, :cond_10

    .line 324
    .line 325
    const/16 v29, 0x1

    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_10
    const-string v12, "httponly"

    .line 329
    .line 330
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 331
    .line 332
    .line 333
    move-result v12

    .line 334
    if-eqz v12, :cond_11

    .line 335
    .line 336
    const/16 v23, 0x1

    .line 337
    .line 338
    goto :goto_5

    .line 339
    :cond_11
    const-string v12, "samesite"

    .line 340
    .line 341
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    if-eqz v0, :cond_12

    .line 346
    .line 347
    move-object/from16 v26, v11

    .line 348
    .line 349
    :catch_1
    :cond_12
    :goto_5
    add-int/lit8 v0, v4, 0x1

    .line 350
    .line 351
    const/4 v4, 0x0

    .line 352
    const/16 v11, 0x3b

    .line 353
    .line 354
    const/16 v12, 0x3d

    .line 355
    .line 356
    goto/16 :goto_2

    .line 357
    .line 358
    :cond_13
    cmp-long v0, v21, v32

    .line 359
    .line 360
    if-nez v0, :cond_14

    .line 361
    .line 362
    move-wide/from16 v17, v32

    .line 363
    .line 364
    goto :goto_7

    .line 365
    :cond_14
    cmp-long v0, v21, v17

    .line 366
    .line 367
    if-eqz v0, :cond_18

    .line 368
    .line 369
    const-wide v4, 0x20c49ba5e353f7L

    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    cmp-long v0, v21, v4

    .line 375
    .line 376
    if-gtz v0, :cond_15

    .line 377
    .line 378
    const/16 v0, 0x3e8

    .line 379
    .line 380
    int-to-long v4, v0

    .line 381
    mul-long v30, v21, v4

    .line 382
    .line 383
    :cond_15
    add-long v30, v9, v30

    .line 384
    .line 385
    cmp-long v0, v30, v9

    .line 386
    .line 387
    if-ltz v0, :cond_17

    .line 388
    .line 389
    cmp-long v0, v30, v19

    .line 390
    .line 391
    if-lez v0, :cond_16

    .line 392
    .line 393
    goto :goto_6

    .line 394
    :cond_16
    move-wide/from16 v17, v30

    .line 395
    .line 396
    goto :goto_7

    .line 397
    :cond_17
    :goto_6
    move-wide/from16 v17, v19

    .line 398
    .line 399
    goto :goto_7

    .line 400
    :cond_18
    move-wide/from16 v17, v27

    .line 401
    .line 402
    :goto_7
    iget-object v0, v1, Lug/t;->d:Ljava/lang/String;

    .line 403
    .line 404
    if-nez v14, :cond_19

    .line 405
    .line 406
    move-object v14, v0

    .line 407
    goto :goto_8

    .line 408
    :cond_19
    invoke-static {v0, v14}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    if-eqz v4, :cond_1a

    .line 413
    .line 414
    goto :goto_8

    .line 415
    :cond_1a
    const/4 v12, 0x0

    .line 416
    invoke-static {v0, v14, v12}, Lef/u;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 417
    .line 418
    .line 419
    move-result v4

    .line 420
    if-eqz v4, :cond_4

    .line 421
    .line 422
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 427
    .line 428
    .line 429
    move-result v5

    .line 430
    sub-int/2addr v4, v5

    .line 431
    add-int/lit8 v4, v4, -0x1

    .line 432
    .line 433
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 434
    .line 435
    .line 436
    move-result v4

    .line 437
    const/16 v5, 0x2e

    .line 438
    .line 439
    if-ne v4, v5, :cond_4

    .line 440
    .line 441
    sget-object v4, Lwg/d;->a:Lef/l;

    .line 442
    .line 443
    sget-object v4, Lwg/d;->a:Lef/l;

    .line 444
    .line 445
    invoke-virtual {v4, v0}, Lef/l;->d(Ljava/lang/CharSequence;)Z

    .line 446
    .line 447
    .line 448
    move-result v4

    .line 449
    if-nez v4, :cond_4

    .line 450
    .line 451
    :goto_8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 456
    .line 457
    .line 458
    move-result v4

    .line 459
    if-eq v0, v4, :cond_1b

    .line 460
    .line 461
    sget-object v0, Lih/a;->d:Lih/a;

    .line 462
    .line 463
    invoke-virtual {v0, v14}, Lih/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    if-nez v0, :cond_1b

    .line 468
    .line 469
    goto/16 :goto_1

    .line 470
    .line 471
    :cond_1b
    const-string v0, "/"

    .line 472
    .line 473
    const/4 v12, 0x0

    .line 474
    if-eqz v13, :cond_1d

    .line 475
    .line 476
    invoke-static {v13, v0, v12}, Lef/u;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 477
    .line 478
    .line 479
    move-result v4

    .line 480
    if-nez v4, :cond_1c

    .line 481
    .line 482
    goto :goto_a

    .line 483
    :cond_1c
    :goto_9
    move-object/from16 v20, v13

    .line 484
    .line 485
    move-object/from16 v19, v14

    .line 486
    .line 487
    goto :goto_b

    .line 488
    :cond_1d
    :goto_a
    invoke-virtual {v1}, Lug/t;->b()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    const/16 v5, 0x2f

    .line 493
    .line 494
    const/4 v8, 0x6

    .line 495
    invoke-static {v4, v5, v12, v8}, Lef/n;->A0(Ljava/lang/CharSequence;CII)I

    .line 496
    .line 497
    .line 498
    move-result v5

    .line 499
    if-eqz v5, :cond_1e

    .line 500
    .line 501
    invoke-virtual {v4, v12, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    const-string v4, "substring(...)"

    .line 506
    .line 507
    invoke-static {v0, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    :cond_1e
    move-object v13, v0

    .line 511
    goto :goto_9

    .line 512
    :goto_b
    new-instance v14, Lug/o;

    .line 513
    .line 514
    move/from16 v22, v23

    .line 515
    .line 516
    move/from16 v23, v25

    .line 517
    .line 518
    move-object/from16 v25, v26

    .line 519
    .line 520
    move/from16 v21, v29

    .line 521
    .line 522
    invoke-direct/range {v14 .. v25}, Lug/o;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V

    .line 523
    .line 524
    .line 525
    :goto_c
    if-nez v14, :cond_1f

    .line 526
    .line 527
    goto :goto_d

    .line 528
    :cond_1f
    if-nez v7, :cond_20

    .line 529
    .line 530
    new-instance v7, Ljava/util/ArrayList;

    .line 531
    .line 532
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 533
    .line 534
    .line 535
    :cond_20
    invoke-interface {v7, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    :goto_d
    add-int/lit8 v6, v6, 0x1

    .line 539
    .line 540
    const/4 v4, 0x0

    .line 541
    goto/16 :goto_0

    .line 542
    .line 543
    :cond_21
    if-eqz v7, :cond_22

    .line 544
    .line 545
    invoke-static {v7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 546
    .line 547
    .line 548
    move-result-object v5

    .line 549
    const-string v0, "unmodifiableList(...)"

    .line 550
    .line 551
    invoke-static {v5, v0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    goto :goto_e

    .line 555
    :cond_22
    const/4 v5, 0x0

    .line 556
    :goto_e
    if-nez v5, :cond_23

    .line 557
    .line 558
    sget-object v5, Lvb/r;->a:Lvb/r;

    .line 559
    .line 560
    :cond_23
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 561
    .line 562
    .line 563
    return-void
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
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
