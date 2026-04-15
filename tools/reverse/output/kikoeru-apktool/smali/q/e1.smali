.class public final Lq/e1;
.super Lj1/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Li2/p;
.implements Lh2/e;
.implements Li2/z;


# instance fields
.field public o:Lq/h1;

.field public p:Lt1/b;

.field public final q:Lh2/h;


# direct methods
.method public constructor <init>(Lq/h1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lj1/p;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq/e1;->o:Lq/h1;

    .line 5
    .line 6
    iget-object v0, p1, Lq/h1;->m:Lx0/e1;

    .line 7
    .line 8
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lt1/b;

    .line 13
    .line 14
    iput-object v0, p0, Lq/e1;->p:Lt1/b;

    .line 15
    .line 16
    sget-object v0, Lq/f1;->a:Lh2/g;

    .line 17
    .line 18
    new-instance v1, Lh2/h;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lh2/h;-><init>(Lh2/g;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0, p1}, Lh2/h;->h0(Lh2/g;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lq/e1;->q:Lh2/h;

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public static final B0(Lq/e1;Lg2/c0;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lq/e1;->o:Lq/h1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq/h1;->g()Lq/g1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Lq/e1;->o:Lq/h1;

    .line 8
    .line 9
    invoke-virtual {p0}, Lq/h1;->g()Lq/g1;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p0, p0, Lq/g1;->b:Lq/q1;

    .line 14
    .line 15
    iget-object p0, p0, Lq/q1;->g:Lg2/c0;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const-wide/16 v1, 0x0

    .line 20
    .line 21
    invoke-interface {p0, p1, v1, v2}, Lg2/c0;->o(Lg2/c0;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-interface {p1}, Lg2/c0;->k()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    const/16 p0, 0x20

    .line 30
    .line 31
    shr-long/2addr v3, p0

    .line 32
    long-to-int v4, v3

    .line 33
    int-to-float v3, v4

    .line 34
    invoke-interface {p1}, Lg2/c0;->k()J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    const-wide v6, 0xffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v4, v6

    .line 44
    long-to-int p1, v4

    .line 45
    int-to-float p1, p1

    .line 46
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    int-to-long v3, v3

    .line 51
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    int-to-long v8, p1

    .line 56
    shl-long p0, v3, p0

    .line 57
    .line 58
    and-long v3, v8, v6

    .line 59
    .line 60
    or-long/2addr p0, v3

    .line 61
    invoke-static {v1, v2, p0, p1}, Ln7/b0;->f(JJ)Lp1/c;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget-object p1, v0, Lq/g1;->e:Lx0/e1;

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    const-string p0, "root"

    .line 72
    .line 73
    invoke-static {p0}, Ljc/l;->k(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/4 p0, 0x0

    .line 77
    throw p0
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


# virtual methods
.method public final C0(Lg2/g;Lg2/u0;J)Lg2/w0;
    .locals 11

    .line 1
    iget-object v0, p0, Lq/e1;->o:Lq/h1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq/h1;->g()Lq/g1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lq/g1;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-wide v1, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const/16 v3, 0x20

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lq/e1;->o:Lq/h1;

    .line 23
    .line 24
    invoke-virtual {v0}, Lq/h1;->f()Lq/x;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lq/x;->c()Lp1/c;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lq/e1;->o:Lq/h1;

    .line 35
    .line 36
    invoke-virtual {v0}, Lq/h1;->g()Lq/g1;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lq/g1;->a()Lp1/c;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_1
    if-eqz v0, :cond_8

    .line 45
    .line 46
    invoke-virtual {v0}, Lp1/c;->c()J

    .line 47
    .line 48
    .line 49
    move-result-wide p3

    .line 50
    invoke-static {p3, p4}, Lgh/g;->N(J)J

    .line 51
    .line 52
    .line 53
    move-result-wide p3

    .line 54
    shr-long v4, p3, v3

    .line 55
    .line 56
    long-to-int v0, v4

    .line 57
    and-long/2addr p3, v1

    .line 58
    long-to-int p4, p3

    .line 59
    const p3, 0x7fffffff

    .line 60
    .line 61
    .line 62
    if-eq v0, p3, :cond_7

    .line 63
    .line 64
    if-eq p4, p3, :cond_7

    .line 65
    .line 66
    const/4 p3, 0x0

    .line 67
    if-gez v0, :cond_2

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    :cond_2
    if-gez p4, :cond_3

    .line 71
    .line 72
    const/4 p4, 0x0

    .line 73
    :cond_3
    const/4 v4, 0x1

    .line 74
    if-ltz v0, :cond_4

    .line 75
    .line 76
    const/4 v5, 0x1

    .line 77
    goto :goto_0

    .line 78
    :cond_4
    const/4 v5, 0x0

    .line 79
    :goto_0
    if-ltz p4, :cond_5

    .line 80
    .line 81
    const/4 p3, 0x1

    .line 82
    :cond_5
    and-int/2addr p3, v5

    .line 83
    if-nez p3, :cond_6

    .line 84
    .line 85
    const-string p3, "width and height must be >= 0"

    .line 86
    .line 87
    invoke-static {p3}, Lf3/i;->a(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    invoke-static {v0, v0, p4, p4}, Lf3/b;->h(IIII)J

    .line 91
    .line 92
    .line 93
    move-result-wide p3

    .line 94
    goto :goto_1

    .line 95
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string p2, "Error: Infinite width/height is invalid. animated bounds: "

    .line 98
    .line 99
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, Lq/e1;->o:Lq/h1;

    .line 103
    .line 104
    invoke-virtual {p2}, Lq/h1;->f()Lq/x;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p2}, Lq/x;->c()Lp1/c;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string p2, ", current bounds: "

    .line 116
    .line 117
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    iget-object p2, p0, Lq/e1;->o:Lq/h1;

    .line 121
    .line 122
    invoke-virtual {p2}, Lq/h1;->g()Lq/g1;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-virtual {p2}, Lq/g1;->a()Lp1/c;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p2

    .line 147
    :cond_8
    :goto_1
    invoke-interface {p2, p3, p4}, Lg2/u0;->v(J)Lg2/g1;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    iget-object p3, p0, Lq/e1;->o:Lq/h1;

    .line 152
    .line 153
    invoke-virtual {p3}, Lq/h1;->g()Lq/g1;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    invoke-virtual {p3}, Lq/g1;->b()Z

    .line 158
    .line 159
    .line 160
    move-result p3

    .line 161
    sget-object p4, Lvb/s;->a:Lvb/s;

    .line 162
    .line 163
    if-nez p3, :cond_9

    .line 164
    .line 165
    iget p3, p2, Lg2/g1;->a:I

    .line 166
    .line 167
    iget v0, p2, Lg2/g1;->b:I

    .line 168
    .line 169
    new-instance v1, Lq/c1;

    .line 170
    .line 171
    const/4 v2, 0x0

    .line 172
    invoke-direct {v1, p0, p2, v2}, Lq/c1;-><init>(Lq/e1;Lg2/g1;I)V

    .line 173
    .line 174
    .line 175
    invoke-interface {p1, p3, v0, p4, v1}, Lg2/x0;->b0(IILjava/util/Map;Lic/k;)Lg2/w0;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    return-object p1

    .line 180
    :cond_9
    iget-object p3, p0, Lq/e1;->o:Lq/h1;

    .line 181
    .line 182
    iget-object p3, p3, Lq/h1;->f:Lx0/e1;

    .line 183
    .line 184
    invoke-virtual {p3}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p3

    .line 188
    check-cast p3, Lq/k1;

    .line 189
    .line 190
    invoke-virtual {p0}, Lq/e1;->D0()Lg2/c0;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-interface {v0}, Lg2/c0;->k()J

    .line 195
    .line 196
    .line 197
    move-result-wide v4

    .line 198
    iget v0, p2, Lg2/g1;->a:I

    .line 199
    .line 200
    iget v6, p2, Lg2/g1;->b:I

    .line 201
    .line 202
    int-to-long v7, v0

    .line 203
    shl-long/2addr v7, v3

    .line 204
    int-to-long v9, v6

    .line 205
    and-long/2addr v9, v1

    .line 206
    or-long/2addr v7, v9

    .line 207
    invoke-interface {p3, v4, v5, v7, v8}, Lq/k1;->a(JJ)J

    .line 208
    .line 209
    .line 210
    shr-long v6, v4, v3

    .line 211
    .line 212
    long-to-int p3, v6

    .line 213
    and-long/2addr v1, v4

    .line 214
    long-to-int v0, v1

    .line 215
    new-instance v1, Lq/c1;

    .line 216
    .line 217
    const/4 v2, 0x1

    .line 218
    invoke-direct {v1, p0, p2, v2}, Lq/c1;-><init>(Lq/e1;Lg2/g1;I)V

    .line 219
    .line 220
    .line 221
    invoke-interface {p1, p3, v0, p4, v1}, Lg2/x0;->b0(IILjava/util/Map;Lic/k;)Lg2/w0;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    return-object p1
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
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
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
.end method

.method public final D0()Lg2/c0;
    .locals 2

    .line 1
    iget-object v0, p0, Lq/e1;->o:Lq/h1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq/h1;->g()Lq/g1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lq/g1;->b:Lq/q1;

    .line 8
    .line 9
    invoke-static {p0}, Li2/f;->x(Li2/m;)Li2/g1;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v0, v0, Lq/q1;->b:Lg2/s0;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lg2/s0;->f(Li2/g1;)Lg2/c0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
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

.method public final E0(Lt1/b;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lq/e1;->p:Lt1/b;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Li2/f;->w(Lj1/p;)Lq1/v;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1, v0}, Lq1/v;->a(Lt1/b;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lq/e1;->o:Lq/h1;

    .line 16
    .line 17
    iget-object v0, v0, Lq/h1;->m:Lx0/e1;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    iput-object p1, p0, Lq/e1;->p:Lt1/b;

    .line 23
    .line 24
    return-void
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

.method public final synthetic G()V
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

.method public final K()La2/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lq/e1;->q:Lh2/h;

    .line 2
    .line 3
    return-object v0
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

.method public final R(Li2/l0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lq/e1;->o:Lq/h1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lq/h1;->a:Z

    .line 5
    .line 6
    iget-object v1, v0, Lq/h1;->h:Lx0/e1;

    .line 7
    .line 8
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lq/s1;

    .line 13
    .line 14
    iget-object v2, p0, Lq/e1;->o:Lq/h1;

    .line 15
    .line 16
    iget-object v2, v2, Lq/h1;->i:Lx0/e1;

    .line 17
    .line 18
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lq/l1;

    .line 23
    .line 24
    iget-object v3, p0, Lq/e1;->o:Lq/h1;

    .line 25
    .line 26
    invoke-virtual {v3}, Lq/h1;->g()Lq/g1;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Lq/g1;->a()Lp1/c;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Li2/l0;->getLayoutDirection()Lf3/m;

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v3, v3, Li2/j0;->y:Lf3/c;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v1, v2, Lq/l1;->b:Lx0/e1;

    .line 50
    .line 51
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Lq/h1;

    .line 56
    .line 57
    const-string v2, "Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized."

    .line 58
    .line 59
    if-eqz v1, :cond_6

    .line 60
    .line 61
    iget-object v1, v1, Lq/h1;->l:Lq/h1;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    if-eqz v1, :cond_0

    .line 65
    .line 66
    iget-object v1, v1, Lq/h1;->i:Lx0/e1;

    .line 67
    .line 68
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lq/l1;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    move-object v1, v3

    .line 76
    :goto_0
    if-eqz v1, :cond_2

    .line 77
    .line 78
    iget-object v1, v1, Lq/l1;->b:Lx0/e1;

    .line 79
    .line 80
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Lq/h1;

    .line 85
    .line 86
    if-eqz v1, :cond_1

    .line 87
    .line 88
    iget-object v3, v1, Lq/h1;->j:Lq1/e0;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 92
    .line 93
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_2
    :goto_1
    iput-object v3, v0, Lq/h1;->j:Lq1/e0;

    .line 98
    .line 99
    iget-object v0, p0, Lq/e1;->o:Lq/h1;

    .line 100
    .line 101
    iget-object v0, v0, Lq/h1;->m:Lx0/e1;

    .line 102
    .line 103
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lt1/b;

    .line 108
    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    new-instance v1, Lq/a1;

    .line 112
    .line 113
    const/4 v2, 0x1

    .line 114
    invoke-direct {v1, p1, v2}, Lq/a1;-><init>(Li2/l0;I)V

    .line 115
    .line 116
    .line 117
    invoke-static {p1, v0, v1}, Lq/t0;->N(Li2/l0;Lt1/b;Lic/k;)V

    .line 118
    .line 119
    .line 120
    iget-object v1, p0, Lq/e1;->o:Lq/h1;

    .line 121
    .line 122
    invoke-virtual {v1}, Lq/h1;->g()Lq/g1;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v2}, Lq/g1;->b()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_4

    .line 131
    .line 132
    invoke-virtual {v1}, Lq/h1;->i()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-nez v2, :cond_3

    .line 137
    .line 138
    invoke-virtual {v1}, Lq/h1;->h()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_3

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_3
    return-void

    .line 146
    :cond_4
    :goto_2
    invoke-static {p1, v0}, Lu3/x0;->k(Ls1/d;Lt1/b;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    const-string v0, "Error: Layer is null when accessed for shared bounds/element : "

    .line 153
    .line 154
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, Lq/e1;->o:Lq/h1;

    .line 158
    .line 159
    invoke-virtual {v0}, Lq/h1;->g()Lq/g1;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    iget-object v0, v0, Lq/g1;->a:Ljava/lang/Object;

    .line 164
    .line 165
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v0, ",target: "

    .line 169
    .line 170
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    iget-object v0, p0, Lq/e1;->o:Lq/h1;

    .line 174
    .line 175
    invoke-virtual {v0}, Lq/h1;->f()Lq/x;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Lq/x;->b()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v0, ", is attached: "

    .line 187
    .line 188
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    iget-boolean v0, p0, Lj1/p;->n:Z

    .line 192
    .line 193
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v0

    .line 210
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 211
    .line 212
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw p1
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
.end method

.method public final synthetic b(Li2/q0;Lg2/u0;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, La0/c;->k(Li2/z;Lg2/y;Lg2/u0;I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final synthetic c(Li2/q0;Lg2/u0;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, La0/c;->d(Li2/z;Lg2/y;Lg2/u0;I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final synthetic d(Li2/q0;Lg2/u0;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, La0/c;->g(Li2/z;Lg2/y;Lg2/u0;I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final synthetic f(Li2/q0;Lg2/u0;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, La0/c;->n(Li2/z;Lg2/y;Lg2/u0;I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final g(Lg2/x0;Lg2/u0;J)Lg2/w0;
    .locals 4

    .line 1
    invoke-interface {p2, p3, p4}, Lg2/u0;->v(J)Lg2/g1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p3, p2, Lg2/g1;->a:I

    .line 6
    .line 7
    int-to-float p3, p3

    .line 8
    iget p4, p2, Lg2/g1;->b:I

    .line 9
    .line 10
    int-to-float p4, p4

    .line 11
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    int-to-long v0, p3

    .line 16
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    int-to-long p3, p3

    .line 21
    const/16 v2, 0x20

    .line 22
    .line 23
    shl-long/2addr v0, v2

    .line 24
    const-wide v2, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr p3, v2

    .line 30
    or-long/2addr p3, v0

    .line 31
    iget v0, p2, Lg2/g1;->a:I

    .line 32
    .line 33
    iget v1, p2, Lg2/g1;->b:I

    .line 34
    .line 35
    new-instance v2, Lq/j;

    .line 36
    .line 37
    invoke-direct {v2, p2, p0, p3, p4}, Lq/j;-><init>(Lg2/g1;Lq/e1;J)V

    .line 38
    .line 39
    .line 40
    sget-object p2, Lvb/s;->a:Lvb/s;

    .line 41
    .line 42
    invoke-interface {p1, v0, v1, p2, v2}, Lg2/x0;->b0(IILjava/util/Map;Lic/k;)Lg2/w0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final r0()V
    .locals 3

    .line 1
    sget-object v0, Lq/f1;->a:Lh2/g;

    .line 2
    .line 3
    iget-object v1, p0, Lq/e1;->o:Lq/h1;

    .line 4
    .line 5
    invoke-static {p0, v0, v1}, La0/c;->p(Lq/e1;Lh2/g;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lq/e1;->o:Lq/h1;

    .line 9
    .line 10
    invoke-static {p0, v0}, La0/c;->a(Lh2/e;Lh2/g;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lq/h1;

    .line 15
    .line 16
    iput-object v0, v1, Lq/h1;->l:Lq/h1;

    .line 17
    .line 18
    invoke-static {p0}, Li2/f;->w(Lj1/p;)Lq1/v;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Lq1/v;->b()Lt1/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Lq/e1;->E0(Lt1/b;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lq/e1;->o:Lq/h1;

    .line 30
    .line 31
    new-instance v1, Lq/d1;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v1, p0, v2}, Lq/d1;-><init>(Lq/e1;I)V

    .line 35
    .line 36
    .line 37
    iput-object v1, v0, Lq/h1;->k:Ljc/m;

    .line 38
    .line 39
    return-void
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
.end method

.method public final synthetic s(Lh2/g;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, La0/c;->a(Lh2/e;Lh2/g;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final t0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lq/e1;->E0(Lt1/b;)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lq/e1;->o:Lq/h1;

    .line 6
    .line 7
    iput-object v0, v1, Lq/h1;->l:Lq/h1;

    .line 8
    .line 9
    sget-object v0, Lq/i0;->d:Lq/i0;

    .line 10
    .line 11
    iput-object v0, v1, Lq/h1;->k:Ljc/m;

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

.method public final v0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq/e1;->p:Lt1/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Li2/f;->w(Lj1/p;)Lq1/v;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1, v0}, Lq1/v;->a(Lt1/b;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {p0}, Li2/f;->w(Lj1/p;)Lq1/v;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Lq1/v;->b()Lt1/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, Lq/e1;->E0(Lt1/b;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
