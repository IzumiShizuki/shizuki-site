.class public final Lpd/h;
.super Lse/b;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic c:I

.field public final d:Lre/i;

.field public final synthetic e:Lbd/c;


# direct methods
.method public constructor <init>(Lpd/i;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lpd/h;->c:I

    .line 1
    iput-object p1, p0, Lpd/h;->e:Lbd/c;

    .line 2
    iget-object v0, p1, Lpd/i;->j:Lb0/w1;

    .line 3
    iget-object v1, v0, Lb0/w1;->c:Ljava/lang/Object;

    check-cast v1, Lod/a;

    .line 4
    iget-object v1, v1, Lod/a;->a:Lre/o;

    .line 5
    invoke-direct {p0, v1}, Lse/b;-><init>(Lre/o;)V

    .line 6
    iget-object v0, v0, Lb0/w1;->c:Ljava/lang/Object;

    check-cast v0, Lod/a;

    .line 7
    iget-object v0, v0, Lod/a;->a:Lre/o;

    .line 8
    new-instance v1, Lpd/g;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lpd/g;-><init>(Lpd/i;I)V

    check-cast v0, Lre/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    new-instance p1, Lre/i;

    .line 10
    invoke-direct {p1, v0, v1}, Lre/h;-><init>(Lre/l;Lic/a;)V

    .line 11
    iput-object p1, p0, Lpd/h;->d:Lre/i;

    return-void
.end method

.method public constructor <init>(Lqe/h;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lpd/h;->c:I

    .line 12
    iput-object p1, p0, Lpd/h;->e:Lbd/c;

    .line 13
    iget-object v0, p1, Lqe/h;->l:Loe/k;

    .line 14
    iget-object v1, v0, Loe/k;->a:Loe/i;

    .line 15
    iget-object v1, v1, Loe/i;->a:Lre/l;

    .line 16
    invoke-direct {p0, v1}, Lse/b;-><init>(Lre/o;)V

    .line 17
    iget-object v0, v0, Loe/k;->a:Loe/i;

    .line 18
    iget-object v0, v0, Loe/i;->a:Lre/l;

    .line 19
    new-instance v1, Lqe/d;

    const/4 v2, 0x6

    invoke-direct {v1, p1, v2}, Lqe/d;-><init>(Lqe/h;I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    new-instance p1, Lre/i;

    .line 21
    invoke-direct {p1, v0, v1}, Lre/h;-><init>(Lre/l;Lic/a;)V

    .line 22
    iput-object p1, p0, Lpd/h;->d:Lre/i;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Collection;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lpd/h;->c:I

    .line 4
    .line 5
    const/16 v3, 0xa

    .line 6
    .line 7
    iget-object v4, v0, Lpd/h;->e:Lbd/c;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v4, Lqe/h;

    .line 13
    .line 14
    iget-object v1, v4, Lqe/h;->e:Lwd/k;

    .line 15
    .line 16
    iget-object v5, v4, Lqe/h;->l:Loe/k;

    .line 17
    .line 18
    iget-object v6, v5, Loe/k;->d:Lbd/f0;

    .line 19
    .line 20
    invoke-static {v1, v6}, Lud/e;->b0(Lwd/k;Lbd/f0;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/Iterable;

    .line 25
    .line 26
    new-instance v6, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_0

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    check-cast v7, Lwd/t0;

    .line 50
    .line 51
    iget-object v8, v5, Loe/k;->h:Lid/h;

    .line 52
    .line 53
    invoke-virtual {v8, v7}, Lid/h;->s(Lwd/t0;)Lse/w;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iget-object v1, v5, Loe/k;->a:Loe/i;

    .line 62
    .line 63
    iget-object v1, v1, Loe/i;->n:Lad/b;

    .line 64
    .line 65
    invoke-interface {v1, v4}, Lad/b;->c(Lyc/e;)Ljava/util/Collection;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/lang/Iterable;

    .line 70
    .line 71
    invoke-static {v6, v1}, Lvb/m;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    new-instance v6, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    :cond_1
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_3

    .line 89
    .line 90
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    check-cast v8, Lse/w;

    .line 95
    .line 96
    invoke-virtual {v8}, Lse/w;->t()Lse/k0;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    invoke-interface {v8}, Lse/k0;->h()Lyc/h;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    instance-of v9, v8, Lyc/c0;

    .line 105
    .line 106
    if-eqz v9, :cond_2

    .line 107
    .line 108
    check-cast v8, Lyc/c0;

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    const/4 v8, 0x0

    .line 112
    :goto_2
    if-eqz v8, :cond_1

    .line 113
    .line 114
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_7

    .line 123
    .line 124
    iget-object v2, v5, Loe/k;->a:Loe/i;

    .line 125
    .line 126
    iget-object v2, v2, Loe/i;->h:Loe/m;

    .line 127
    .line 128
    new-instance v5, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-static {v6, v3}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-eqz v6, :cond_6

    .line 146
    .line 147
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    check-cast v6, Lyc/c0;

    .line 152
    .line 153
    invoke-static {v6}, Lie/d;->f(Lyc/h;)Lbe/b;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    if-eqz v7, :cond_4

    .line 158
    .line 159
    invoke-virtual {v7}, Lbe/b;->a()Lbe/c;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    if-eqz v7, :cond_4

    .line 164
    .line 165
    iget-object v7, v7, Lbe/c;->a:Lbe/d;

    .line 166
    .line 167
    iget-object v7, v7, Lbe/d;->a:Ljava/lang/String;

    .line 168
    .line 169
    if-nez v7, :cond_5

    .line 170
    .line 171
    :cond_4
    invoke-virtual {v6}, Lbd/c;->getName()Lbe/e;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-virtual {v6}, Lbe/e;->b()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    const-string v6, "asString(...)"

    .line 180
    .line 181
    invoke-static {v7, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    :cond_5
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_6
    invoke-interface {v2, v4, v5}, Loe/m;->b(Lyc/e;Ljava/util/ArrayList;)V

    .line 189
    .line 190
    .line 191
    :cond_7
    invoke-static {v1}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    check-cast v1, Ljava/util/Collection;

    .line 196
    .line 197
    return-object v1

    .line 198
    :pswitch_0
    check-cast v4, Lpd/i;

    .line 199
    .line 200
    iget-object v8, v4, Lpd/i;->j:Lb0/w1;

    .line 201
    .line 202
    iget-object v1, v4, Lpd/i;->h:Led/o;

    .line 203
    .line 204
    iget-object v1, v1, Led/o;->a:Ljava/lang/Class;

    .line 205
    .line 206
    const-class v5, Ljava/lang/Object;

    .line 207
    .line 208
    invoke-static {v1, v5}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    const/4 v7, 0x2

    .line 213
    sget-object v12, Lvb/r;->a:Lvb/r;

    .line 214
    .line 215
    if-eqz v6, :cond_8

    .line 216
    .line 217
    move-object v5, v12

    .line 218
    goto :goto_6

    .line 219
    :cond_8
    new-instance v6, Lhd/q0;

    .line 220
    .line 221
    invoke-direct {v6, v7}, Lhd/q0;-><init>(I)V

    .line 222
    .line 223
    .line 224
    iget-object v9, v6, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    if-nez v10, :cond_9

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_9
    move-object v5, v10

    .line 234
    :goto_4
    invoke-virtual {v6, v5}, Lhd/q0;->f(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v6, v1}, Lhd/q0;->i(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    new-array v1, v1, [Ljava/lang/reflect/Type;

    .line 249
    .line 250
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-static {v1}, Lud/b;->x([Ljava/lang/Object;)Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, Ljava/lang/Iterable;

    .line 259
    .line 260
    new-instance v5, Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-static {v1, v3}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 263
    .line 264
    .line 265
    move-result v6

    .line 266
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 267
    .line 268
    .line 269
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v6

    .line 277
    if-eqz v6, :cond_a

    .line 278
    .line 279
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    check-cast v6, Ljava/lang/reflect/Type;

    .line 284
    .line 285
    new-instance v9, Led/q;

    .line 286
    .line 287
    invoke-direct {v9, v6}, Led/q;-><init>(Ljava/lang/reflect/Type;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_a
    :goto_6
    new-instance v1, Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 301
    .line 302
    .line 303
    new-instance v15, Ljava/util/ArrayList;

    .line 304
    .line 305
    const/4 v11, 0x0

    .line 306
    invoke-direct {v15, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 307
    .line 308
    .line 309
    iget-object v6, v4, Lpd/i;->u:Lod/c;

    .line 310
    .line 311
    sget-object v9, Lld/w;->n:Lbe/c;

    .line 312
    .line 313
    const-string v10, "PURELY_IMPLEMENTS_ANNOTATION"

    .line 314
    .line 315
    invoke-static {v9, v10}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v6, v9}, Lod/c;->e(Lbe/c;)Lzc/b;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    const/4 v9, 0x1

    .line 323
    if-nez v6, :cond_c

    .line 324
    .line 325
    :cond_b
    :goto_7
    const/4 v2, 0x0

    .line 326
    goto/16 :goto_d

    .line 327
    .line 328
    :cond_c
    invoke-interface {v6}, Lzc/b;->c()Ljava/util/Map;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    invoke-interface {v6}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    check-cast v6, Ljava/lang/Iterable;

    .line 337
    .line 338
    invoke-static {v6}, Lvb/m;->y0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    instance-of v10, v6, Lge/w;

    .line 343
    .line 344
    if-eqz v10, :cond_d

    .line 345
    .line 346
    check-cast v6, Lge/w;

    .line 347
    .line 348
    goto :goto_8

    .line 349
    :cond_d
    const/4 v6, 0x0

    .line 350
    :goto_8
    if-eqz v6, :cond_b

    .line 351
    .line 352
    iget-object v6, v6, Lge/g;->a:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v6, Ljava/lang/String;

    .line 355
    .line 356
    if-nez v6, :cond_e

    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_e
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 360
    .line 361
    .line 362
    move-result v10

    .line 363
    sget-object v13, Lbe/i;->a:Lbe/i;

    .line 364
    .line 365
    const/4 v14, 0x0

    .line 366
    :goto_9
    sget-object v2, Lbe/i;->c:Lbe/i;

    .line 367
    .line 368
    if-ge v14, v10, :cond_15

    .line 369
    .line 370
    invoke-virtual {v6, v14}, Ljava/lang/String;->charAt(I)C

    .line 371
    .line 372
    .line 373
    move-result v11

    .line 374
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    if-eqz v3, :cond_12

    .line 379
    .line 380
    if-eq v3, v9, :cond_10

    .line 381
    .line 382
    if-ne v3, v7, :cond_f

    .line 383
    .line 384
    goto :goto_b

    .line 385
    :cond_f
    new-instance v1, Lce/j0;

    .line 386
    .line 387
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 388
    .line 389
    .line 390
    throw v1

    .line 391
    :cond_10
    const/16 v3, 0x2e

    .line 392
    .line 393
    if-ne v11, v3, :cond_11

    .line 394
    .line 395
    :goto_a
    move-object v13, v2

    .line 396
    goto :goto_c

    .line 397
    :cond_11
    invoke-static {v11}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    if-nez v2, :cond_14

    .line 402
    .line 403
    goto :goto_7

    .line 404
    :cond_12
    :goto_b
    invoke-static {v11}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    if-nez v2, :cond_13

    .line 409
    .line 410
    goto :goto_7

    .line 411
    :cond_13
    sget-object v2, Lbe/i;->b:Lbe/i;

    .line 412
    .line 413
    goto :goto_a

    .line 414
    :cond_14
    :goto_c
    add-int/lit8 v14, v14, 0x1

    .line 415
    .line 416
    const/16 v3, 0xa

    .line 417
    .line 418
    const/4 v11, 0x0

    .line 419
    goto :goto_9

    .line 420
    :cond_15
    if-eq v13, v2, :cond_b

    .line 421
    .line 422
    new-instance v2, Lbe/c;

    .line 423
    .line 424
    invoke-direct {v2, v6}, Lbe/c;-><init>(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    :goto_d
    if-eqz v2, :cond_16

    .line 428
    .line 429
    iget-object v3, v2, Lbe/c;->a:Lbe/d;

    .line 430
    .line 431
    invoke-virtual {v3}, Lbe/d;->c()Z

    .line 432
    .line 433
    .line 434
    move-result v6

    .line 435
    if-nez v6, :cond_16

    .line 436
    .line 437
    sget-object v6, Lvc/o;->j:Lbe/e;

    .line 438
    .line 439
    const-string v7, "segment"

    .line 440
    .line 441
    invoke-static {v6, v7}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v3, v6}, Lbe/d;->h(Lbe/e;)Z

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    if-eqz v3, :cond_16

    .line 449
    .line 450
    goto :goto_e

    .line 451
    :cond_16
    const/4 v2, 0x0

    .line 452
    :goto_e
    sget-object v3, Lse/x0;->c:Lse/x0;

    .line 453
    .line 454
    if-nez v2, :cond_18

    .line 455
    .line 456
    sget-object v6, Lld/j;->a:Ljava/util/LinkedHashMap;

    .line 457
    .line 458
    invoke-static {v4}, Lie/d;->g(Lyc/k;)Lbe/c;

    .line 459
    .line 460
    .line 461
    move-result-object v6

    .line 462
    sget-object v7, Lld/j;->b:Ljava/util/Map;

    .line 463
    .line 464
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    check-cast v6, Lbe/c;

    .line 469
    .line 470
    if-nez v6, :cond_19

    .line 471
    .line 472
    :cond_17
    :goto_f
    const/4 v2, 0x0

    .line 473
    goto/16 :goto_13

    .line 474
    .line 475
    :cond_18
    move-object v6, v2

    .line 476
    :cond_19
    iget-object v7, v8, Lb0/w1;->c:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v7, Lod/a;

    .line 479
    .line 480
    iget-object v7, v7, Lod/a;->o:Lyc/y;

    .line 481
    .line 482
    sget v10, Lie/d;->a:I

    .line 483
    .line 484
    const-string v10, "<this>"

    .line 485
    .line 486
    invoke-static {v7, v10}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    iget-object v10, v6, Lbe/c;->a:Lbe/d;

    .line 490
    .line 491
    invoke-virtual {v10}, Lbe/d;->c()Z

    .line 492
    .line 493
    .line 494
    invoke-virtual {v6}, Lbe/c;->b()Lbe/c;

    .line 495
    .line 496
    .line 497
    move-result-object v6

    .line 498
    invoke-interface {v7, v6}, Lyc/y;->K0(Lbe/c;)Lyc/h0;

    .line 499
    .line 500
    .line 501
    move-result-object v6

    .line 502
    check-cast v6, Lbd/c0;

    .line 503
    .line 504
    iget-object v6, v6, Lbd/c0;->g:Lle/k;

    .line 505
    .line 506
    invoke-virtual {v10}, Lbe/d;->g()Lbe/e;

    .line 507
    .line 508
    .line 509
    move-result-object v7

    .line 510
    sget-object v10, Lgd/b;->h:Lgd/b;

    .line 511
    .line 512
    invoke-virtual {v6, v7, v10}, Lle/k;->a(Lbe/e;Lgd/b;)Lyc/h;

    .line 513
    .line 514
    .line 515
    move-result-object v6

    .line 516
    instance-of v7, v6, Lyc/e;

    .line 517
    .line 518
    if-eqz v7, :cond_1a

    .line 519
    .line 520
    check-cast v6, Lyc/e;

    .line 521
    .line 522
    goto :goto_10

    .line 523
    :cond_1a
    const/4 v6, 0x0

    .line 524
    :goto_10
    if-nez v6, :cond_1b

    .line 525
    .line 526
    goto :goto_f

    .line 527
    :cond_1b
    invoke-interface {v6}, Lyc/h;->Q()Lse/k0;

    .line 528
    .line 529
    .line 530
    move-result-object v7

    .line 531
    invoke-interface {v7}, Lse/k0;->o()Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object v7

    .line 535
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 536
    .line 537
    .line 538
    move-result v7

    .line 539
    iget-object v10, v4, Lpd/i;->p:Lpd/h;

    .line 540
    .line 541
    invoke-virtual {v10}, Lpd/h;->o()Ljava/util/List;

    .line 542
    .line 543
    .line 544
    move-result-object v10

    .line 545
    const-string v11, "getParameters(...)"

    .line 546
    .line 547
    invoke-static {v10, v11}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 551
    .line 552
    .line 553
    move-result v11

    .line 554
    if-ne v11, v7, :cond_1c

    .line 555
    .line 556
    check-cast v10, Ljava/lang/Iterable;

    .line 557
    .line 558
    new-instance v2, Ljava/util/ArrayList;

    .line 559
    .line 560
    const/16 v7, 0xa

    .line 561
    .line 562
    invoke-static {v10, v7}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 563
    .line 564
    .line 565
    move-result v9

    .line 566
    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 567
    .line 568
    .line 569
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 570
    .line 571
    .line 572
    move-result-object v7

    .line 573
    :goto_11
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 574
    .line 575
    .line 576
    move-result v9

    .line 577
    if-eqz v9, :cond_1e

    .line 578
    .line 579
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v9

    .line 583
    check-cast v9, Lyc/q0;

    .line 584
    .line 585
    new-instance v10, Lse/f0;

    .line 586
    .line 587
    invoke-interface {v9}, Lyc/h;->E()Lse/a0;

    .line 588
    .line 589
    .line 590
    move-result-object v9

    .line 591
    invoke-direct {v10, v9, v3}, Lse/f0;-><init>(Lse/w;Lse/x0;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    goto :goto_11

    .line 598
    :cond_1c
    if-ne v11, v9, :cond_17

    .line 599
    .line 600
    if-le v7, v9, :cond_17

    .line 601
    .line 602
    if-nez v2, :cond_17

    .line 603
    .line 604
    new-instance v2, Lse/f0;

    .line 605
    .line 606
    invoke-static {v10}, Lvb/m;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v10

    .line 610
    check-cast v10, Lyc/q0;

    .line 611
    .line 612
    invoke-interface {v10}, Lyc/h;->E()Lse/a0;

    .line 613
    .line 614
    .line 615
    move-result-object v10

    .line 616
    invoke-direct {v2, v10, v3}, Lse/f0;-><init>(Lse/w;Lse/x0;)V

    .line 617
    .line 618
    .line 619
    new-instance v10, Loc/d;

    .line 620
    .line 621
    invoke-direct {v10, v9, v7, v9}, Loc/b;-><init>(III)V

    .line 622
    .line 623
    .line 624
    new-instance v7, Ljava/util/ArrayList;

    .line 625
    .line 626
    const/16 v9, 0xa

    .line 627
    .line 628
    invoke-static {v10, v9}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 629
    .line 630
    .line 631
    move-result v11

    .line 632
    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v10}, Loc/b;->a()Loc/c;

    .line 636
    .line 637
    .line 638
    move-result-object v9

    .line 639
    :goto_12
    iget-boolean v10, v9, Loc/c;->c:Z

    .line 640
    .line 641
    if-eqz v10, :cond_1d

    .line 642
    .line 643
    invoke-virtual {v9}, Lvb/v;->nextInt()I

    .line 644
    .line 645
    .line 646
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    goto :goto_12

    .line 650
    :cond_1d
    move-object v2, v7

    .line 651
    :cond_1e
    sget-object v7, Lse/h0;->b:Lm0/w;

    .line 652
    .line 653
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    sget-object v7, Lse/h0;->c:Lse/h0;

    .line 657
    .line 658
    invoke-static {v7, v6, v2}, Lse/c;->u(Lse/h0;Lyc/e;Ljava/util/List;)Lse/a0;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    :goto_13
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 663
    .line 664
    .line 665
    move-result-object v18

    .line 666
    :cond_1f
    :goto_14
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 667
    .line 668
    .line 669
    move-result v5

    .line 670
    if-eqz v5, :cond_24

    .line 671
    .line 672
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v5

    .line 676
    move-object v11, v5

    .line 677
    check-cast v11, Led/q;

    .line 678
    .line 679
    iget-object v5, v8, Lb0/w1;->e:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast v5, Lc7/e1;

    .line 682
    .line 683
    sget-object v6, Lse/s0;->a:Lse/s0;

    .line 684
    .line 685
    const/4 v7, 0x7

    .line 686
    const/4 v13, 0x0

    .line 687
    const/4 v14, 0x0

    .line 688
    invoke-static {v6, v14, v13, v7}, Ln7/e;->F(Lse/s0;ZLpd/e0;I)Lqd/a;

    .line 689
    .line 690
    .line 691
    move-result-object v6

    .line 692
    invoke-virtual {v5, v11, v6}, Lc7/e1;->h0(Lsd/d;Lqd/a;)Lse/w;

    .line 693
    .line 694
    .line 695
    move-result-object v16

    .line 696
    iget-object v5, v8, Lb0/w1;->c:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v5, Lod/a;

    .line 699
    .line 700
    iget-object v5, v5, Lod/a;->r:Ltd/c;

    .line 701
    .line 702
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    new-instance v10, Ltd/p;

    .line 706
    .line 707
    sget-object v9, Lld/a;->e:Lld/a;

    .line 708
    .line 709
    move-object v6, v5

    .line 710
    move-object v5, v10

    .line 711
    const/4 v10, 0x1

    .line 712
    move-object v7, v6

    .line 713
    const/4 v6, 0x0

    .line 714
    move-object/from16 v17, v7

    .line 715
    .line 716
    const/4 v7, 0x0

    .line 717
    invoke-direct/range {v5 .. v10}, Ltd/p;-><init>(Lzc/a;ZLb0/w1;Lld/a;Z)V

    .line 718
    .line 719
    .line 720
    move-object v6, v13

    .line 721
    const/4 v13, 0x0

    .line 722
    const/4 v7, 0x0

    .line 723
    const/4 v14, 0x0

    .line 724
    move-object v10, v5

    .line 725
    move-object v5, v11

    .line 726
    move-object/from16 v11, v16

    .line 727
    .line 728
    move-object/from16 v9, v17

    .line 729
    .line 730
    const/16 v17, 0x0

    .line 731
    .line 732
    move-object/from16 v16, v6

    .line 733
    .line 734
    invoke-virtual/range {v9 .. v14}, Ltd/c;->b(Ltd/p;Lse/w;Ljava/util/List;Ltd/r;Z)Lse/w;

    .line 735
    .line 736
    .line 737
    move-result-object v6

    .line 738
    if-nez v6, :cond_20

    .line 739
    .line 740
    move-object v6, v11

    .line 741
    :cond_20
    invoke-virtual {v6}, Lse/w;->t()Lse/k0;

    .line 742
    .line 743
    .line 744
    move-result-object v7

    .line 745
    invoke-interface {v7}, Lse/k0;->h()Lyc/h;

    .line 746
    .line 747
    .line 748
    move-result-object v7

    .line 749
    instance-of v7, v7, Lyc/c0;

    .line 750
    .line 751
    if-eqz v7, :cond_21

    .line 752
    .line 753
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    :cond_21
    invoke-virtual {v6}, Lse/w;->t()Lse/k0;

    .line 757
    .line 758
    .line 759
    move-result-object v5

    .line 760
    if-eqz v2, :cond_22

    .line 761
    .line 762
    invoke-virtual {v2}, Lse/w;->t()Lse/k0;

    .line 763
    .line 764
    .line 765
    move-result-object v13

    .line 766
    goto :goto_15

    .line 767
    :cond_22
    move-object/from16 v13, v16

    .line 768
    .line 769
    :goto_15
    invoke-static {v5, v13}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    move-result v5

    .line 773
    if-eqz v5, :cond_23

    .line 774
    .line 775
    goto :goto_14

    .line 776
    :cond_23
    invoke-static {v6}, Lvc/i;->x(Lse/w;)Z

    .line 777
    .line 778
    .line 779
    move-result v5

    .line 780
    if-nez v5, :cond_1f

    .line 781
    .line 782
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    goto :goto_14

    .line 786
    :cond_24
    const/16 v16, 0x0

    .line 787
    .line 788
    iget-object v5, v4, Lpd/i;->i:Lyc/e;

    .line 789
    .line 790
    if-eqz v5, :cond_25

    .line 791
    .line 792
    invoke-static {v5, v4}, Lvb/w;->g(Lyc/e;Lyc/e;)Lse/g0;

    .line 793
    .line 794
    .line 795
    move-result-object v6

    .line 796
    new-instance v7, Lse/r0;

    .line 797
    .line 798
    invoke-direct {v7, v6}, Lse/r0;-><init>(Lse/p0;)V

    .line 799
    .line 800
    .line 801
    invoke-interface {v5}, Lyc/e;->E()Lse/a0;

    .line 802
    .line 803
    .line 804
    move-result-object v5

    .line 805
    invoke-virtual {v7, v5, v3}, Lse/r0;->i(Lse/w;Lse/x0;)Lse/w;

    .line 806
    .line 807
    .line 808
    move-result-object v3

    .line 809
    goto :goto_16

    .line 810
    :cond_25
    move-object/from16 v3, v16

    .line 811
    .line 812
    :goto_16
    invoke-static {v1, v3}, Lbf/m;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    .line 813
    .line 814
    .line 815
    invoke-static {v1, v2}, Lbf/m;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 819
    .line 820
    .line 821
    move-result v2

    .line 822
    if-nez v2, :cond_27

    .line 823
    .line 824
    iget-object v2, v8, Lb0/w1;->c:Ljava/lang/Object;

    .line 825
    .line 826
    check-cast v2, Lod/a;

    .line 827
    .line 828
    iget-object v2, v2, Lod/a;->f:Loe/m;

    .line 829
    .line 830
    new-instance v3, Ljava/util/ArrayList;

    .line 831
    .line 832
    const/16 v7, 0xa

    .line 833
    .line 834
    invoke-static {v15, v7}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 835
    .line 836
    .line 837
    move-result v5

    .line 838
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 842
    .line 843
    .line 844
    move-result-object v5

    .line 845
    :goto_17
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 846
    .line 847
    .line 848
    move-result v6

    .line 849
    if-eqz v6, :cond_26

    .line 850
    .line 851
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v6

    .line 855
    check-cast v6, Lsd/d;

    .line 856
    .line 857
    const-string v7, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType"

    .line 858
    .line 859
    invoke-static {v6, v7}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    check-cast v6, Led/q;

    .line 863
    .line 864
    iget-object v6, v6, Led/q;->a:Ljava/lang/reflect/Type;

    .line 865
    .line 866
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v6

    .line 870
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 871
    .line 872
    .line 873
    goto :goto_17

    .line 874
    :cond_26
    invoke-interface {v2, v4, v3}, Loe/m;->b(Lyc/e;Ljava/util/ArrayList;)V

    .line 875
    .line 876
    .line 877
    :cond_27
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 878
    .line 879
    .line 880
    move-result v2

    .line 881
    if-nez v2, :cond_28

    .line 882
    .line 883
    invoke-static {v1}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 884
    .line 885
    .line 886
    move-result-object v1

    .line 887
    :goto_18
    check-cast v1, Ljava/util/Collection;

    .line 888
    .line 889
    goto :goto_19

    .line 890
    :cond_28
    iget-object v1, v8, Lb0/w1;->c:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast v1, Lod/a;

    .line 893
    .line 894
    iget-object v1, v1, Lod/a;->o:Lyc/y;

    .line 895
    .line 896
    invoke-interface {v1}, Lyc/y;->g()Lvc/i;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    invoke-virtual {v1}, Lvc/i;->e()Lse/a0;

    .line 901
    .line 902
    .line 903
    move-result-object v1

    .line 904
    invoke-static {v1}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 905
    .line 906
    .line 907
    move-result-object v1

    .line 908
    goto :goto_18

    .line 909
    :goto_19
    return-object v1

    .line 910
    nop

    .line 911
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method

.method public final d()Lyc/n0;
    .locals 1

    .line 1
    iget v0, p0, Lpd/h;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lyc/n0;->c:Lyc/n0;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lpd/h;->e:Lbd/c;

    .line 10
    .line 11
    check-cast v0, Lpd/i;

    .line 12
    .line 13
    iget-object v0, v0, Lpd/i;->j:Lb0/w1;

    .line 14
    .line 15
    iget-object v0, v0, Lb0/w1;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lod/a;

    .line 18
    .line 19
    iget-object v0, v0, Lod/a;->m:Lyc/n0;

    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final h()Lyc/h;
    .locals 1

    .line 1
    iget v0, p0, Lpd/h;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpd/h;->e:Lbd/c;

    .line 7
    .line 8
    check-cast v0, Lqe/h;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lpd/h;->e:Lbd/c;

    .line 12
    .line 13
    check-cast v0, Lpd/i;

    .line 14
    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final j()Z
    .locals 1

    .line 1
    iget v0, p0, Lpd/h;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :pswitch_0
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    nop

    .line 11
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final m()Lyc/e;
    .locals 1

    .line 1
    iget v0, p0, Lpd/h;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpd/h;->e:Lbd/c;

    .line 7
    .line 8
    check-cast v0, Lqe/h;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lpd/h;->e:Lbd/c;

    .line 12
    .line 13
    check-cast v0, Lpd/i;

    .line 14
    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final o()Ljava/util/List;
    .locals 1

    .line 1
    iget v0, p0, Lpd/h;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpd/h;->d:Lre/i;

    .line 7
    .line 8
    invoke-virtual {v0}, Lre/i;->b()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/List;

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lpd/h;->d:Lre/i;

    .line 16
    .line 17
    invoke-virtual {v0}, Lre/i;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/List;

    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lpd/h;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpd/h;->e:Lbd/c;

    .line 7
    .line 8
    check-cast v0, Lqe/h;

    .line 9
    .line 10
    invoke-virtual {v0}, Lbd/c;->getName()Lbe/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Lbe/e;->a:Ljava/lang/String;

    .line 15
    .line 16
    const-string v1, "toString(...)"

    .line 17
    .line 18
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lpd/h;->e:Lbd/c;

    .line 23
    .line 24
    check-cast v0, Lpd/i;

    .line 25
    .line 26
    invoke-virtual {v0}, Lbd/c;->getName()Lbe/e;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lbe/e;->b()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "asString(...)"

    .line 35
    .line 36
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
