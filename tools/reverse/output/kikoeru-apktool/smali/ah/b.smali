.class public final Lah/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lug/u;


# static fields
.field public static final a:Lah/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lah/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lah/b;->a:Lah/b;

    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final a(Lah/h;)Lug/d0;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "close"

    .line 4
    .line 5
    iget-object v3, v0, Lah/h;->d:Lb5/d0;

    .line 6
    .line 7
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v3, Lb5/d0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lzg/n;

    .line 13
    .line 14
    iget-object v4, v3, Lb5/d0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v9, v4

    .line 17
    check-cast v9, Lah/f;

    .line 18
    .line 19
    iget-object v10, v0, Lah/h;->e:Lb7/b1;

    .line 20
    .line 21
    iget-object v0, v10, Lb7/b1;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lug/b0;

    .line 24
    .line 25
    iget-object v4, v10, Lb7/b1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lug/r;

    .line 28
    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v11

    .line 33
    iget-object v5, v10, Lb7/b1;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v5}, Lgh/g;->K(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v14, 0x1

    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    const/4 v5, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v5, 0x0

    .line 50
    :goto_0
    const-string v15, "Connection"

    .line 51
    .line 52
    invoke-virtual {v4, v15}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    const-string v8, "upgrade"

    .line 57
    .line 58
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v16

    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    :try_start_0
    invoke-interface {v9, v10}, Lah/f;->h(Lb7/b1;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6

    .line 65
    .line 66
    .line 67
    if-eqz v5, :cond_4

    .line 68
    .line 69
    :try_start_1
    const-string v5, "100-continue"

    .line 70
    .line 71
    const-string v6, "Expect"

    .line 72
    .line 73
    invoke-virtual {v4, v6}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 81
    if-eqz v4, :cond_1

    .line 82
    .line 83
    :try_start_2
    invoke-interface {v9}, Lah/f;->f()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 84
    .line 85
    .line 86
    :try_start_3
    invoke-virtual {v3, v14}, Lb5/d0;->r(Z)Lug/c0;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    move-object/from16 v18, v4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :catch_0
    move-exception v0

    .line 94
    move-object v14, v8

    .line 95
    :goto_1
    move-object/from16 v18, v17

    .line 96
    .line 97
    goto/16 :goto_5

    .line 98
    .line 99
    :catch_1
    move-exception v0

    .line 100
    invoke-virtual {v3, v0}, Lb5/d0;->s(Ljava/io/IOException;)V

    .line 101
    .line 102
    .line 103
    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 104
    :cond_1
    move-object/from16 v18, v17

    .line 105
    .line 106
    :goto_2
    if-nez v18, :cond_2

    .line 107
    .line 108
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v2, v10, Lb7/b1;->e:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v2, Lug/b0;

    .line 114
    .line 115
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Lug/b0;->a()J

    .line 119
    .line 120
    .line 121
    move-result-wide v5

    .line 122
    invoke-interface {v9, v5, v6, v10}, Lah/f;->j(JLb7/b1;)Llh/f0;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    new-instance v2, Lzg/f;

    .line 127
    .line 128
    const/4 v7, 0x0

    .line 129
    invoke-direct/range {v2 .. v7}, Lzg/f;-><init>(Lb5/d0;Llh/f0;JZ)V

    .line 130
    .line 131
    .line 132
    invoke-static {v2}, Lg8/a;->k(Llh/f0;)Llh/a0;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v0, v2}, Lug/b0;->c(Llh/a0;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Llh/a0;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 140
    .line 141
    .line 142
    move-object v14, v8

    .line 143
    goto :goto_4

    .line 144
    :catch_2
    move-exception v0

    .line 145
    move-object v14, v8

    .line 146
    goto :goto_5

    .line 147
    :cond_2
    const/4 v6, 0x0

    .line 148
    const/4 v7, 0x0

    .line 149
    move-object v4, v8

    .line 150
    const/4 v8, 0x0

    .line 151
    move-object v5, v4

    .line 152
    const/4 v4, 0x1

    .line 153
    move-object/from16 v19, v5

    .line 154
    .line 155
    const/4 v5, 0x0

    .line 156
    move-object/from16 v14, v19

    .line 157
    .line 158
    :try_start_5
    invoke-virtual/range {v2 .. v8}, Lzg/n;->i(Lb5/d0;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Lb5/d0;->l()Lzg/o;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iget-object v0, v0, Lzg/o;->i:Lch/p;

    .line 166
    .line 167
    if-eqz v0, :cond_3

    .line 168
    .line 169
    const/4 v0, 0x1

    .line 170
    goto :goto_3

    .line 171
    :cond_3
    const/4 v0, 0x0

    .line 172
    :goto_3
    if-nez v0, :cond_5

    .line 173
    .line 174
    invoke-interface {v9}, Lah/f;->i()Lah/e;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-interface {v0}, Lah/e;->f()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :catch_3
    move-exception v0

    .line 183
    goto :goto_5

    .line 184
    :cond_4
    move-object v14, v8

    .line 185
    const/4 v6, 0x0

    .line 186
    const/4 v7, 0x0

    .line 187
    const/4 v8, 0x0

    .line 188
    const/4 v4, 0x1

    .line 189
    const/4 v5, 0x0

    .line 190
    :try_start_6
    invoke-virtual/range {v2 .. v8}, Lzg/n;->i(Lb5/d0;ZZZZLjava/io/IOException;)Ljava/io/IOException;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 191
    .line 192
    .line 193
    move-object/from16 v18, v17

    .line 194
    .line 195
    :cond_5
    :goto_4
    :try_start_7
    invoke-interface {v9}, Lah/f;->a()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 196
    .line 197
    .line 198
    move-object/from16 v8, v17

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :catch_4
    move-exception v0

    .line 202
    :try_start_8
    invoke-virtual {v3, v0}, Lb5/d0;->s(Ljava/io/IOException;)V

    .line 203
    .line 204
    .line 205
    throw v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    .line 206
    :catch_5
    move-exception v0

    .line 207
    goto :goto_1

    .line 208
    :catch_6
    move-exception v0

    .line 209
    move-object v14, v8

    .line 210
    :try_start_9
    invoke-virtual {v3, v0}, Lb5/d0;->s(Ljava/io/IOException;)V

    .line 211
    .line 212
    .line 213
    throw v0
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5

    .line 214
    :goto_5
    instance-of v2, v0, Lch/a;

    .line 215
    .line 216
    if-nez v2, :cond_19

    .line 217
    .line 218
    iget-boolean v2, v3, Lb5/d0;->a:Z

    .line 219
    .line 220
    if-eqz v2, :cond_18

    .line 221
    .line 222
    move-object v8, v0

    .line 223
    :goto_6
    if-nez v18, :cond_6

    .line 224
    .line 225
    :try_start_a
    invoke-virtual {v3, v13}, Lb5/d0;->r(Z)Lug/c0;

    .line 226
    .line 227
    .line 228
    move-result-object v18

    .line 229
    invoke-static/range {v18 .. v18}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    :cond_6
    move-object/from16 v0, v18

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :catch_7
    move-exception v0

    .line 236
    goto/16 :goto_f

    .line 237
    .line 238
    :goto_7
    iput-object v10, v0, Lug/c0;->a:Lb7/b1;

    .line 239
    .line 240
    invoke-virtual {v3}, Lb5/d0;->l()Lzg/o;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    iget-object v2, v2, Lzg/o;->f:Lug/q;

    .line 245
    .line 246
    iput-object v2, v0, Lug/c0;->e:Lug/q;

    .line 247
    .line 248
    iput-wide v11, v0, Lug/c0;->l:J

    .line 249
    .line 250
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 251
    .line 252
    .line 253
    move-result-wide v4

    .line 254
    iput-wide v4, v0, Lug/c0;->m:J

    .line 255
    .line 256
    invoke-virtual {v0}, Lug/c0;->a()Lug/d0;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    iget v2, v0, Lug/d0;->d:I
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    .line 261
    .line 262
    :goto_8
    iget-object v4, v0, Lug/d0;->f:Lug/r;

    .line 263
    .line 264
    iget-object v5, v0, Lug/d0;->g:Lug/f0;

    .line 265
    .line 266
    const/16 v6, 0x64

    .line 267
    .line 268
    if-ne v2, v6, :cond_7

    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_7
    const/16 v6, 0x66

    .line 272
    .line 273
    if-gt v6, v2, :cond_8

    .line 274
    .line 275
    const/16 v6, 0xc8

    .line 276
    .line 277
    if-ge v2, v6, :cond_8

    .line 278
    .line 279
    :goto_9
    :try_start_b
    invoke-virtual {v3, v13}, Lb5/d0;->r(Z)Lug/c0;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    iput-object v10, v0, Lug/c0;->a:Lb7/b1;

    .line 287
    .line 288
    invoke-virtual {v3}, Lb5/d0;->l()Lzg/o;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    iget-object v2, v2, Lzg/o;->f:Lug/q;

    .line 293
    .line 294
    iput-object v2, v0, Lug/c0;->e:Lug/q;

    .line 295
    .line 296
    iput-wide v11, v0, Lug/c0;->l:J

    .line 297
    .line 298
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 299
    .line 300
    .line 301
    move-result-wide v4

    .line 302
    iput-wide v4, v0, Lug/c0;->m:J

    .line 303
    .line 304
    invoke-virtual {v0}, Lug/c0;->a()Lug/d0;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    iget v2, v0, Lug/d0;->d:I

    .line 309
    .line 310
    goto :goto_8

    .line 311
    :cond_8
    const/16 v6, 0x65

    .line 312
    .line 313
    if-ne v2, v6, :cond_9

    .line 314
    .line 315
    const/4 v6, 0x1

    .line 316
    goto :goto_a

    .line 317
    :cond_9
    const/4 v6, 0x0

    .line 318
    :goto_a
    if-eqz v6, :cond_c

    .line 319
    .line 320
    invoke-virtual {v3}, Lb5/d0;->l()Lzg/o;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    iget-object v7, v7, Lzg/o;->i:Lch/p;

    .line 325
    .line 326
    if-eqz v7, :cond_a

    .line 327
    .line 328
    const/4 v7, 0x1

    .line 329
    goto :goto_b

    .line 330
    :cond_a
    const/4 v7, 0x0

    .line 331
    :goto_b
    if-nez v7, :cond_b

    .line 332
    .line 333
    goto :goto_c

    .line 334
    :cond_b
    new-instance v0, Ljava/net/ProtocolException;

    .line 335
    .line 336
    const-string v1, "Unexpected 101 code on HTTP/2 connection"

    .line 337
    .line 338
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    throw v0

    .line 342
    :cond_c
    :goto_c
    if-eqz v6, :cond_e

    .line 343
    .line 344
    invoke-virtual {v4, v15}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    if-nez v6, :cond_d

    .line 349
    .line 350
    move-object/from16 v6, v17

    .line 351
    .line 352
    :cond_d
    invoke-virtual {v14, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 353
    .line 354
    .line 355
    move-result v6

    .line 356
    if-eqz v6, :cond_e

    .line 357
    .line 358
    const/4 v13, 0x1

    .line 359
    :cond_e
    if-eqz v16, :cond_f

    .line 360
    .line 361
    if-eqz v13, :cond_f

    .line 362
    .line 363
    invoke-virtual {v0}, Lug/d0;->g()Lug/c0;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    new-instance v4, Lwg/c;

    .line 368
    .line 369
    invoke-virtual {v5}, Lug/f0;->i()Lug/v;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    invoke-virtual {v5}, Lug/f0;->g()J

    .line 374
    .line 375
    .line 376
    move-result-wide v10

    .line 377
    invoke-direct {v4, v6, v10, v11}, Lwg/c;-><init>(Lug/v;J)V

    .line 378
    .line 379
    .line 380
    iput-object v4, v0, Lug/c0;->g:Lug/f0;

    .line 381
    .line 382
    invoke-virtual {v3}, Lb5/d0;->v()Lv2/e;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    iput-object v3, v0, Lug/c0;->h:Llh/g0;

    .line 387
    .line 388
    invoke-virtual {v0}, Lug/c0;->a()Lug/d0;

    .line 389
    .line 390
    .line 391
    move-result-object v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7

    .line 392
    move v11, v2

    .line 393
    goto :goto_e

    .line 394
    :cond_f
    :try_start_c
    const-string v5, "Content-Type"

    .line 395
    .line 396
    invoke-virtual {v4, v5}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    if-nez v4, :cond_10

    .line 401
    .line 402
    move-object/from16 v10, v17

    .line 403
    .line 404
    goto :goto_d

    .line 405
    :cond_10
    move-object v10, v4

    .line 406
    :goto_d
    invoke-interface {v9, v0}, Lah/f;->e(Lug/d0;)J

    .line 407
    .line 408
    .line 409
    move-result-wide v5

    .line 410
    invoke-interface {v9, v0}, Lah/f;->c(Lug/d0;)Llh/h0;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    move v7, v2

    .line 415
    new-instance v2, Lzg/g;

    .line 416
    .line 417
    move v11, v7

    .line 418
    const/4 v7, 0x0

    .line 419
    invoke-direct/range {v2 .. v7}, Lzg/g;-><init>(Lb5/d0;Llh/h0;JZ)V

    .line 420
    .line 421
    .line 422
    new-instance v4, Lah/i;

    .line 423
    .line 424
    invoke-static {v2}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    invoke-direct {v4, v10, v5, v6, v2}, Lah/i;-><init>(Ljava/lang/String;JLlh/b0;)V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8

    .line 429
    .line 430
    .line 431
    :try_start_d
    invoke-virtual {v0}, Lug/d0;->g()Lug/c0;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    iput-object v4, v0, Lug/c0;->g:Lug/f0;

    .line 436
    .line 437
    new-instance v2, Lah/a;

    .line 438
    .line 439
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 440
    .line 441
    .line 442
    iput-object v2, v0, Lug/c0;->o:Lug/i0;

    .line 443
    .line 444
    invoke-virtual {v0}, Lug/c0;->a()Lug/d0;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    :goto_e
    iget-object v2, v0, Lug/d0;->a:Lb7/b1;

    .line 449
    .line 450
    iget-object v2, v2, Lb7/b1;->d:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v2, Lug/r;

    .line 453
    .line 454
    invoke-virtual {v2, v15}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    if-nez v2, :cond_12

    .line 463
    .line 464
    iget-object v2, v0, Lug/d0;->f:Lug/r;

    .line 465
    .line 466
    invoke-virtual {v2, v15}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    if-nez v2, :cond_11

    .line 471
    .line 472
    move-object/from16 v2, v17

    .line 473
    .line 474
    :cond_11
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    if-eqz v1, :cond_13

    .line 479
    .line 480
    :cond_12
    invoke-interface {v9}, Lah/f;->i()Lah/e;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    invoke-interface {v1}, Lah/e;->f()V

    .line 485
    .line 486
    .line 487
    :cond_13
    const/16 v1, 0xcc

    .line 488
    .line 489
    if-eq v11, v1, :cond_14

    .line 490
    .line 491
    const/16 v1, 0xcd

    .line 492
    .line 493
    if-ne v11, v1, :cond_15

    .line 494
    .line 495
    :cond_14
    iget-object v1, v0, Lug/d0;->g:Lug/f0;

    .line 496
    .line 497
    invoke-virtual {v1}, Lug/f0;->g()J

    .line 498
    .line 499
    .line 500
    move-result-wide v1

    .line 501
    const-wide/16 v3, 0x0

    .line 502
    .line 503
    cmp-long v5, v1, v3

    .line 504
    .line 505
    if-gtz v5, :cond_16

    .line 506
    .line 507
    :cond_15
    return-object v0

    .line 508
    :cond_16
    new-instance v1, Ljava/net/ProtocolException;

    .line 509
    .line 510
    new-instance v2, Ljava/lang/StringBuilder;

    .line 511
    .line 512
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 513
    .line 514
    .line 515
    const-string v3, "HTTP "

    .line 516
    .line 517
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    const-string v3, " had non-zero Content-Length: "

    .line 524
    .line 525
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    iget-object v0, v0, Lug/d0;->g:Lug/f0;

    .line 529
    .line 530
    invoke-virtual {v0}, Lug/f0;->g()J

    .line 531
    .line 532
    .line 533
    move-result-wide v3

    .line 534
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    throw v1

    .line 545
    :catch_8
    move-exception v0

    .line 546
    invoke-virtual {v3, v0}, Lb5/d0;->s(Ljava/io/IOException;)V

    .line 547
    .line 548
    .line 549
    throw v0
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7

    .line 550
    :goto_f
    if-eqz v8, :cond_17

    .line 551
    .line 552
    invoke-static {v8, v0}, Lub/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 553
    .line 554
    .line 555
    throw v8

    .line 556
    :cond_17
    throw v0

    .line 557
    :cond_18
    throw v0

    .line 558
    :cond_19
    throw v0
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
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
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
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
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method
