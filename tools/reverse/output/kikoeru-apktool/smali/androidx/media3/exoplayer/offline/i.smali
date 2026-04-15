.class public final synthetic Landroidx/media3/exoplayer/offline/i;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/offline/i;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/offline/i;->a:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lz4/b;

    .line 10
    .line 11
    check-cast p2, Lz4/b;

    .line 12
    .line 13
    iget v0, p1, Lz4/b;->c:I

    .line 14
    .line 15
    iget v1, p2, Lz4/b;->c:I

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p1, p1, Lz4/b;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object p2, p2, Lz4/b;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    :goto_0
    return v0

    .line 33
    :pswitch_0
    check-cast p1, Lx6/c;

    .line 34
    .line 35
    check-cast p2, Lx6/c;

    .line 36
    .line 37
    iget-wide v0, p1, Lx6/c;->b:J

    .line 38
    .line 39
    iget-wide p1, p2, Lx6/c;->b:J

    .line 40
    .line 41
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    :pswitch_1
    check-cast p1, Lx6/d;

    .line 47
    .line 48
    check-cast p2, Lx6/d;

    .line 49
    .line 50
    iget-object p1, p1, Lx6/d;->a:Lx6/e;

    .line 51
    .line 52
    iget p1, p1, Lx6/e;->b:I

    .line 53
    .line 54
    iget-object p2, p2, Lx6/d;->a:Lx6/e;

    .line 55
    .line 56
    iget p2, p2, Lx6/e;->b:I

    .line 57
    .line 58
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    return p1

    .line 63
    :pswitch_2
    check-cast p1, Lx0/l0;

    .line 64
    .line 65
    check-cast p2, Lx0/l0;

    .line 66
    .line 67
    iget p1, p1, Lx0/l0;->b:I

    .line 68
    .line 69
    iget p2, p2, Lx0/l0;->b:I

    .line 70
    .line 71
    invoke-static {p1, p2}, Ljc/l;->g(II)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    return p1

    .line 76
    :pswitch_3
    check-cast p1, Lub/k;

    .line 77
    .line 78
    check-cast p2, Lub/k;

    .line 79
    .line 80
    iget-object v0, p1, Lub/k;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Ljava/lang/Number;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object p1, p1, Lub/k;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    sub-int/2addr v0, p1

    .line 97
    iget-object p1, p2, Lub/k;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    iget-object p2, p2, Lub/k;->a:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p2, Ljava/lang/Number;

    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    sub-int/2addr p1, p2

    .line 114
    sub-int/2addr v0, p1

    .line 115
    return v0

    .line 116
    :pswitch_4
    check-cast p1, [B

    .line 117
    .line 118
    check-cast p2, [B

    .line 119
    .line 120
    array-length v0, p1

    .line 121
    array-length v1, p2

    .line 122
    if-eq v0, v1, :cond_1

    .line 123
    .line 124
    array-length p1, p1

    .line 125
    array-length p2, p2

    .line 126
    sub-int v3, p1, p2

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_1
    const/4 v0, 0x0

    .line 130
    :goto_1
    array-length v1, p1

    .line 131
    if-ge v0, v1, :cond_3

    .line 132
    .line 133
    aget-byte v1, p1, v0

    .line 134
    .line 135
    aget-byte v2, p2, v0

    .line 136
    .line 137
    if-eq v1, v2, :cond_2

    .line 138
    .line 139
    sub-int v3, v1, v2

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_3
    :goto_2
    return v3

    .line 146
    :pswitch_5
    check-cast p1, Lp6/d;

    .line 147
    .line 148
    check-cast p2, Lp6/d;

    .line 149
    .line 150
    iget p2, p2, Lp6/d;->b:I

    .line 151
    .line 152
    iget p1, p1, Lp6/d;->b:I

    .line 153
    .line 154
    invoke-static {p2, p1}, Ljava/lang/Integer;->compare(II)I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    return p1

    .line 159
    :pswitch_6
    check-cast p1, Ln5/s;

    .line 160
    .line 161
    check-cast p2, Ln5/s;

    .line 162
    .line 163
    iget p1, p1, Ln5/s;->c:F

    .line 164
    .line 165
    iget p2, p2, Ln5/s;->c:F

    .line 166
    .line 167
    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    return p1

    .line 172
    :pswitch_7
    check-cast p1, Ln5/s;

    .line 173
    .line 174
    check-cast p2, Ln5/s;

    .line 175
    .line 176
    iget p1, p1, Ln5/s;->a:I

    .line 177
    .line 178
    iget p2, p2, Ln5/s;->a:I

    .line 179
    .line 180
    sub-int/2addr p1, p2

    .line 181
    return p1

    .line 182
    :pswitch_8
    check-cast p1, Lm5/o;

    .line 183
    .line 184
    check-cast p2, Lm5/o;

    .line 185
    .line 186
    iget-boolean v0, p1, Lm5/o;->e:Z

    .line 187
    .line 188
    iget v1, p1, Lm5/o;->j:I

    .line 189
    .line 190
    if-eqz v0, :cond_4

    .line 191
    .line 192
    iget-boolean v0, p1, Lm5/o;->h:Z

    .line 193
    .line 194
    if-eqz v0, :cond_4

    .line 195
    .line 196
    sget-object v0, Lm5/p;->j:Lya/y0;

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_4
    sget-object v0, Lm5/p;->j:Lya/y0;

    .line 200
    .line 201
    invoke-virtual {v0}, Lya/y0;->a()Lya/y0;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    :goto_3
    iget-object v2, p1, Lm5/o;->f:Lm5/j;

    .line 206
    .line 207
    iget-boolean v2, v2, Lm4/o1;->z:Z

    .line 208
    .line 209
    sget-object v3, Lya/y;->a:Lya/w;

    .line 210
    .line 211
    if-eqz v2, :cond_5

    .line 212
    .line 213
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    iget v4, p2, Lm5/o;->j:I

    .line 218
    .line 219
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    sget-object v5, Lm5/p;->j:Lya/y0;

    .line 224
    .line 225
    invoke-virtual {v5}, Lya/y0;->a()Lya/y0;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    invoke-virtual {v3, v2, v4, v5}, Lya/w;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    :cond_5
    iget p1, p1, Lm5/o;->k:I

    .line 234
    .line 235
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    iget v2, p2, Lm5/o;->k:I

    .line 240
    .line 241
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-virtual {v3, p1, v2, v0}, Lya/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    iget p2, p2, Lm5/o;->j:I

    .line 254
    .line 255
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    invoke-virtual {p1, v1, p2, v0}, Lya/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-virtual {p1}, Lya/y;->e()I

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    return p1

    .line 268
    :pswitch_9
    check-cast p1, Lm5/o;

    .line 269
    .line 270
    check-cast p2, Lm5/o;

    .line 271
    .line 272
    invoke-static {p1, p2}, Lm5/o;->c(Lm5/o;Lm5/o;)I

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    return p1

    .line 277
    :pswitch_a
    check-cast p1, Ljava/util/List;

    .line 278
    .line 279
    check-cast p2, Ljava/util/List;

    .line 280
    .line 281
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    check-cast p1, Lm5/l;

    .line 286
    .line 287
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    check-cast p2, Lm5/l;

    .line 292
    .line 293
    invoke-virtual {p1, p2}, Lm5/l;->c(Lm5/l;)I

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    return p1

    .line 298
    :pswitch_b
    check-cast p1, Ljava/util/List;

    .line 299
    .line 300
    check-cast p2, Ljava/util/List;

    .line 301
    .line 302
    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    check-cast p1, Lm5/f;

    .line 307
    .line 308
    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p2

    .line 312
    check-cast p2, Lm5/f;

    .line 313
    .line 314
    invoke-virtual {p1, p2}, Lm5/f;->c(Lm5/f;)I

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    return p1

    .line 319
    :pswitch_c
    check-cast p1, Ljava/util/List;

    .line 320
    .line 321
    check-cast p2, Ljava/util/List;

    .line 322
    .line 323
    new-instance v0, Landroidx/media3/exoplayer/offline/i;

    .line 324
    .line 325
    const/16 v1, 0xd

    .line 326
    .line 327
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/offline/i;-><init>(I)V

    .line 328
    .line 329
    .line 330
    invoke-static {p1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    check-cast v0, Lm5/o;

    .line 335
    .line 336
    new-instance v2, Landroidx/media3/exoplayer/offline/i;

    .line 337
    .line 338
    invoke-direct {v2, v1}, Landroidx/media3/exoplayer/offline/i;-><init>(I)V

    .line 339
    .line 340
    .line 341
    invoke-static {p2, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    check-cast v1, Lm5/o;

    .line 346
    .line 347
    invoke-static {v0, v1}, Lm5/o;->c(Lm5/o;Lm5/o;)I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    invoke-static {v0}, Lya/w;->f(I)Lya/y;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    invoke-virtual {v0, v1, v2}, Lya/y;->a(II)Lya/y;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    new-instance v1, Landroidx/media3/exoplayer/offline/i;

    .line 368
    .line 369
    const/16 v2, 0xe

    .line 370
    .line 371
    invoke-direct {v1, v2}, Landroidx/media3/exoplayer/offline/i;-><init>(I)V

    .line 372
    .line 373
    .line 374
    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    check-cast p1, Lm5/o;

    .line 379
    .line 380
    new-instance v1, Landroidx/media3/exoplayer/offline/i;

    .line 381
    .line 382
    invoke-direct {v1, v2}, Landroidx/media3/exoplayer/offline/i;-><init>(I)V

    .line 383
    .line 384
    .line 385
    invoke-static {p2, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object p2

    .line 389
    check-cast p2, Lm5/o;

    .line 390
    .line 391
    new-instance v1, Landroidx/media3/exoplayer/offline/i;

    .line 392
    .line 393
    invoke-direct {v1, v2}, Landroidx/media3/exoplayer/offline/i;-><init>(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0, p1, p2, v1}, Lya/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    invoke-virtual {p1}, Lya/y;->e()I

    .line 401
    .line 402
    .line 403
    move-result p1

    .line 404
    return p1

    .line 405
    :pswitch_d
    check-cast p1, Ljava/util/List;

    .line 406
    .line 407
    check-cast p2, Ljava/util/List;

    .line 408
    .line 409
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    check-cast p1, Lm5/g;

    .line 414
    .line 415
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object p2

    .line 419
    check-cast p2, Lm5/g;

    .line 420
    .line 421
    iget p1, p1, Lm5/g;->f:I

    .line 422
    .line 423
    iget p2, p2, Lm5/g;->f:I

    .line 424
    .line 425
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    .line 426
    .line 427
    .line 428
    move-result p1

    .line 429
    return p1

    .line 430
    :pswitch_e
    check-cast p1, Ljava/lang/Integer;

    .line 431
    .line 432
    check-cast p2, Ljava/lang/Integer;

    .line 433
    .line 434
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    if-ne v0, v1, :cond_6

    .line 439
    .line 440
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 441
    .line 442
    .line 443
    move-result p1

    .line 444
    if-ne p1, v1, :cond_8

    .line 445
    .line 446
    const/4 v1, 0x0

    .line 447
    goto :goto_4

    .line 448
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    if-ne v0, v1, :cond_7

    .line 453
    .line 454
    const/4 v1, 0x1

    .line 455
    goto :goto_4

    .line 456
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 457
    .line 458
    .line 459
    move-result p1

    .line 460
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 461
    .line 462
    .line 463
    move-result p2

    .line 464
    sub-int v1, p1, p2

    .line 465
    .line 466
    :cond_8
    :goto_4
    return v1

    .line 467
    :pswitch_f
    check-cast p1, Lm4/q;

    .line 468
    .line 469
    check-cast p2, Lm4/q;

    .line 470
    .line 471
    iget p2, p2, Lm4/q;->j:I

    .line 472
    .line 473
    iget p1, p1, Lm4/q;->j:I

    .line 474
    .line 475
    sub-int/2addr p2, p1

    .line 476
    return p2

    .line 477
    :pswitch_10
    check-cast p1, Landroid/view/View;

    .line 478
    .line 479
    check-cast p2, Landroid/view/View;

    .line 480
    .line 481
    if-ne p1, p2, :cond_9

    .line 482
    .line 483
    goto :goto_5

    .line 484
    :cond_9
    sget-object v0, Lj2/u1;->d:Lo/k0;

    .line 485
    .line 486
    invoke-virtual {v0, p1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object p1

    .line 490
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    check-cast p1, Landroid/graphics/Rect;

    .line 494
    .line 495
    invoke-virtual {v0, p2}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object p2

    .line 499
    invoke-static {p2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    check-cast p2, Landroid/graphics/Rect;

    .line 503
    .line 504
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 505
    .line 506
    iget v1, p2, Landroid/graphics/Rect;->left:I

    .line 507
    .line 508
    sub-int/2addr v0, v1

    .line 509
    if-nez v0, :cond_a

    .line 510
    .line 511
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 512
    .line 513
    iget p2, p2, Landroid/graphics/Rect;->right:I

    .line 514
    .line 515
    sub-int/2addr p1, p2

    .line 516
    sget p2, Lj2/u1;->c:I

    .line 517
    .line 518
    mul-int v3, p1, p2

    .line 519
    .line 520
    goto :goto_5

    .line 521
    :cond_a
    sget p1, Lj2/u1;->c:I

    .line 522
    .line 523
    mul-int v3, v0, p1

    .line 524
    .line 525
    :goto_5
    return v3

    .line 526
    :pswitch_11
    check-cast p1, Landroid/view/View;

    .line 527
    .line 528
    check-cast p2, Landroid/view/View;

    .line 529
    .line 530
    if-ne p1, p2, :cond_b

    .line 531
    .line 532
    goto :goto_6

    .line 533
    :cond_b
    sget-object v0, Lj2/u1;->d:Lo/k0;

    .line 534
    .line 535
    invoke-virtual {v0, p1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object p1

    .line 539
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    check-cast p1, Landroid/graphics/Rect;

    .line 543
    .line 544
    invoke-virtual {v0, p2}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object p2

    .line 548
    invoke-static {p2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    check-cast p2, Landroid/graphics/Rect;

    .line 552
    .line 553
    iget v0, p1, Landroid/graphics/Rect;->top:I

    .line 554
    .line 555
    iget v1, p2, Landroid/graphics/Rect;->top:I

    .line 556
    .line 557
    sub-int v3, v0, v1

    .line 558
    .line 559
    if-nez v3, :cond_c

    .line 560
    .line 561
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 562
    .line 563
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 564
    .line 565
    sub-int v3, p1, p2

    .line 566
    .line 567
    :cond_c
    :goto_6
    return v3

    .line 568
    :pswitch_12
    check-cast p1, Li2/j0;

    .line 569
    .line 570
    check-cast p2, Li2/j0;

    .line 571
    .line 572
    iget-object v0, p1, Li2/j0;->G:Li2/n0;

    .line 573
    .line 574
    iget-object v0, v0, Li2/n0;->p:Li2/z0;

    .line 575
    .line 576
    iget v0, v0, Li2/z0;->F:F

    .line 577
    .line 578
    iget-object v1, p2, Li2/j0;->G:Li2/n0;

    .line 579
    .line 580
    iget-object v1, v1, Li2/n0;->p:Li2/z0;

    .line 581
    .line 582
    iget v1, v1, Li2/z0;->F:F

    .line 583
    .line 584
    cmpg-float v2, v0, v1

    .line 585
    .line 586
    if-nez v2, :cond_d

    .line 587
    .line 588
    invoke-virtual {p1}, Li2/j0;->w()I

    .line 589
    .line 590
    .line 591
    move-result p1

    .line 592
    invoke-virtual {p2}, Li2/j0;->w()I

    .line 593
    .line 594
    .line 595
    move-result p2

    .line 596
    invoke-static {p1, p2}, Ljc/l;->g(II)I

    .line 597
    .line 598
    .line 599
    move-result p1

    .line 600
    goto :goto_7

    .line 601
    :cond_d
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 602
    .line 603
    .line 604
    move-result p1

    .line 605
    :goto_7
    return p1

    .line 606
    :pswitch_13
    check-cast p1, Ld7/f;

    .line 607
    .line 608
    check-cast p2, Ld7/f;

    .line 609
    .line 610
    iget v0, p2, Ld7/f;->a:I

    .line 611
    .line 612
    iget v1, p1, Ld7/f;->a:I

    .line 613
    .line 614
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    if-eqz v0, :cond_e

    .line 619
    .line 620
    goto :goto_8

    .line 621
    :cond_e
    iget-object v0, p2, Ld7/f;->c:Ljava/lang/String;

    .line 622
    .line 623
    iget-object v1, p1, Ld7/f;->c:Ljava/lang/String;

    .line 624
    .line 625
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 626
    .line 627
    .line 628
    move-result v0

    .line 629
    if-eqz v0, :cond_f

    .line 630
    .line 631
    goto :goto_8

    .line 632
    :cond_f
    iget-object p2, p2, Ld7/f;->d:Ljava/lang/String;

    .line 633
    .line 634
    iget-object p1, p1, Ld7/f;->d:Ljava/lang/String;

    .line 635
    .line 636
    invoke-virtual {p2, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 637
    .line 638
    .line 639
    move-result v0

    .line 640
    :goto_8
    return v0

    .line 641
    :pswitch_14
    check-cast p1, Ld7/f;

    .line 642
    .line 643
    check-cast p2, Ld7/f;

    .line 644
    .line 645
    iget v0, p2, Ld7/f;->b:I

    .line 646
    .line 647
    iget v1, p1, Ld7/f;->b:I

    .line 648
    .line 649
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 650
    .line 651
    .line 652
    move-result v0

    .line 653
    if-eqz v0, :cond_10

    .line 654
    .line 655
    goto :goto_9

    .line 656
    :cond_10
    iget-object v0, p1, Ld7/f;->c:Ljava/lang/String;

    .line 657
    .line 658
    iget-object v1, p2, Ld7/f;->c:Ljava/lang/String;

    .line 659
    .line 660
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 661
    .line 662
    .line 663
    move-result v0

    .line 664
    if-eqz v0, :cond_11

    .line 665
    .line 666
    goto :goto_9

    .line 667
    :cond_11
    iget-object p1, p1, Ld7/f;->d:Ljava/lang/String;

    .line 668
    .line 669
    iget-object p2, p2, Ld7/f;->d:Ljava/lang/String;

    .line 670
    .line 671
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    :goto_9
    return v0

    .line 676
    :pswitch_15
    check-cast p1, Lb0/r0;

    .line 677
    .line 678
    check-cast p2, Lb0/r0;

    .line 679
    .line 680
    invoke-interface {p1}, Lb0/r0;->getIndex()I

    .line 681
    .line 682
    .line 683
    move-result p1

    .line 684
    invoke-interface {p2}, Lb0/r0;->getIndex()I

    .line 685
    .line 686
    .line 687
    move-result p2

    .line 688
    invoke-static {p1, p2}, Ljc/l;->g(II)I

    .line 689
    .line 690
    .line 691
    move-result p1

    .line 692
    return p1

    .line 693
    :pswitch_16
    check-cast p1, Landroidx/media3/exoplayer/offline/d;

    .line 694
    .line 695
    check-cast p2, Landroidx/media3/exoplayer/offline/d;

    .line 696
    .line 697
    iget-wide v4, p1, Landroidx/media3/exoplayer/offline/d;->c:J

    .line 698
    .line 699
    iget-wide p1, p2, Landroidx/media3/exoplayer/offline/d;->c:J

    .line 700
    .line 701
    sget v0, Lp4/c0;->a:I

    .line 702
    .line 703
    cmp-long v0, v4, p1

    .line 704
    .line 705
    if-gez v0, :cond_12

    .line 706
    .line 707
    goto :goto_a

    .line 708
    :cond_12
    if-nez v0, :cond_13

    .line 709
    .line 710
    const/4 v1, 0x0

    .line 711
    goto :goto_a

    .line 712
    :cond_13
    const/4 v1, 0x1

    .line 713
    :goto_a
    return v1

    .line 714
    nop

    .line 715
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
