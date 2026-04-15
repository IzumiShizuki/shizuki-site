.class public final Lge/h;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# direct methods
.method static constructor <clinit>()V
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

.method public static a(Ljava/util/List;Lyc/y;Lvc/k;)Lge/b;
    .locals 3

    .line 1
    check-cast p0, Ljava/lang/Iterable;

    .line 2
    .line 3
    invoke-static {p0}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Iterable;

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-static {v2, v1}, Lge/h;->b(Lbd/h0;Ljava/lang/Object;)Lge/g;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    if-eqz p1, :cond_2

    .line 40
    .line 41
    new-instance p0, Lge/x;

    .line 42
    .line 43
    invoke-interface {p1}, Lyc/y;->g()Lvc/i;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1, p2}, Lvc/i;->q(Lvc/k;)Lse/a0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p0, v0, p1}, Lge/x;-><init>(Ljava/util/List;Lse/w;)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    new-instance p0, Lge/b;

    .line 56
    .line 57
    new-instance p1, Lbd/a;

    .line 58
    .line 59
    const/4 v1, 0x6

    .line 60
    invoke-direct {p1, v1, p2}, Lbd/a;-><init>(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, v0, p1}, Lge/b;-><init>(Ljava/util/List;Lic/k;)V

    .line 64
    .line 65
    .line 66
    return-object p0
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

.method public static b(Lbd/h0;Ljava/lang/Object;)Lge/g;
    .locals 6

    .line 1
    instance-of v0, p1, Ljava/lang/Byte;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lge/d;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-direct {p0, p1}, Lge/d;-><init>(B)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    instance-of v0, p1, Ljava/lang/Short;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance p0, Lge/v;

    .line 22
    .line 23
    check-cast p1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-direct {p0, p1}, Lge/v;-><init>(S)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    new-instance p0, Lge/k;

    .line 38
    .line 39
    check-cast p1, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-direct {p0, p1}, Lge/k;-><init>(I)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_2
    instance-of v0, p1, Ljava/lang/Long;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    new-instance p0, Lge/t;

    .line 54
    .line 55
    check-cast p1, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    invoke-direct {p0, v0, v1}, Lge/t;-><init>(J)V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_3
    instance-of v0, p1, Ljava/lang/Character;

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    new-instance p0, Lge/e;

    .line 70
    .line 71
    check-cast p1, Ljava/lang/Character;

    .line 72
    .line 73
    invoke-direct {p0, p1}, Lge/g;-><init>(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_4
    instance-of v0, p1, Ljava/lang/Float;

    .line 78
    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    new-instance p0, Lge/c;

    .line 82
    .line 83
    check-cast p1, Ljava/lang/Number;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-direct {p0, p1}, Lge/c;-><init>(F)V

    .line 90
    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_5
    instance-of v0, p1, Ljava/lang/Double;

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    new-instance p0, Lge/c;

    .line 98
    .line 99
    check-cast p1, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    invoke-direct {p0, v0, v1}, Lge/c;-><init>(D)V

    .line 106
    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_6
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 110
    .line 111
    if-eqz v0, :cond_7

    .line 112
    .line 113
    new-instance p0, Lge/c;

    .line 114
    .line 115
    check-cast p1, Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-direct {p0, p1}, Lge/c;-><init>(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_7
    instance-of v0, p1, Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    new-instance p0, Lge/w;

    .line 126
    .line 127
    check-cast p1, Ljava/lang/String;

    .line 128
    .line 129
    invoke-direct {p0, p1}, Lge/g;-><init>(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_8
    instance-of v0, p1, [B

    .line 134
    .line 135
    sget-object v1, Lvb/r;->a:Lvb/r;

    .line 136
    .line 137
    const/4 v2, 0x1

    .line 138
    const/4 v3, 0x0

    .line 139
    if-eqz v0, :cond_b

    .line 140
    .line 141
    check-cast p1, [B

    .line 142
    .line 143
    array-length v0, p1

    .line 144
    if-eqz v0, :cond_a

    .line 145
    .line 146
    if-eq v0, v2, :cond_9

    .line 147
    .line 148
    new-instance v1, Ljava/util/ArrayList;

    .line 149
    .line 150
    array-length v0, p1

    .line 151
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 152
    .line 153
    .line 154
    array-length v0, p1

    .line 155
    :goto_0
    if-ge v3, v0, :cond_a

    .line 156
    .line 157
    aget-byte v2, p1, v3

    .line 158
    .line 159
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    add-int/lit8 v3, v3, 0x1

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_9
    aget-byte p1, p1, v3

    .line 170
    .line 171
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-static {p1}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    :cond_a
    sget-object p1, Lvc/k;->h:Lvc/k;

    .line 180
    .line 181
    invoke-static {v1, p0, p1}, Lge/h;->a(Ljava/util/List;Lyc/y;Lvc/k;)Lge/b;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    return-object p0

    .line 186
    :cond_b
    instance-of v0, p1, [S

    .line 187
    .line 188
    if-eqz v0, :cond_e

    .line 189
    .line 190
    check-cast p1, [S

    .line 191
    .line 192
    array-length v0, p1

    .line 193
    if-eqz v0, :cond_d

    .line 194
    .line 195
    if-eq v0, v2, :cond_c

    .line 196
    .line 197
    new-instance v1, Ljava/util/ArrayList;

    .line 198
    .line 199
    array-length v0, p1

    .line 200
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 201
    .line 202
    .line 203
    array-length v0, p1

    .line 204
    :goto_1
    if-ge v3, v0, :cond_d

    .line 205
    .line 206
    aget-short v2, p1, v3

    .line 207
    .line 208
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    add-int/lit8 v3, v3, 0x1

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_c
    aget-short p1, p1, v3

    .line 219
    .line 220
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-static {p1}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    :cond_d
    sget-object p1, Lvc/k;->i:Lvc/k;

    .line 229
    .line 230
    invoke-static {v1, p0, p1}, Lge/h;->a(Ljava/util/List;Lyc/y;Lvc/k;)Lge/b;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    return-object p0

    .line 235
    :cond_e
    instance-of v0, p1, [I

    .line 236
    .line 237
    if-eqz v0, :cond_12

    .line 238
    .line 239
    check-cast p1, [I

    .line 240
    .line 241
    const-string v0, "<this>"

    .line 242
    .line 243
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    array-length v0, p1

    .line 247
    if-eqz v0, :cond_10

    .line 248
    .line 249
    const/4 v1, 0x0

    .line 250
    const/4 v2, 0x1

    .line 251
    if-eq v0, v2, :cond_f

    .line 252
    .line 253
    new-instance v0, Ljava/util/ArrayList;

    .line 254
    .line 255
    array-length v2, p1

    .line 256
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 257
    .line 258
    .line 259
    array-length v2, p1

    .line 260
    :goto_2
    if-ge v1, v2, :cond_11

    .line 261
    .line 262
    aget v3, p1, v1

    .line 263
    .line 264
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    add-int/lit8 v1, v1, 0x1

    .line 272
    .line 273
    goto :goto_2

    .line 274
    :cond_f
    aget p1, p1, v1

    .line 275
    .line 276
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-static {p1}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    goto :goto_3

    .line 285
    :cond_10
    sget-object v0, Lvb/r;->a:Lvb/r;

    .line 286
    .line 287
    :cond_11
    :goto_3
    sget-object p1, Lvc/k;->j:Lvc/k;

    .line 288
    .line 289
    invoke-static {v0, p0, p1}, Lge/h;->a(Ljava/util/List;Lyc/y;Lvc/k;)Lge/b;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    return-object p0

    .line 294
    :cond_12
    instance-of v0, p1, [J

    .line 295
    .line 296
    if-eqz v0, :cond_16

    .line 297
    .line 298
    check-cast p1, [J

    .line 299
    .line 300
    const-string v0, "<this>"

    .line 301
    .line 302
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    array-length v0, p1

    .line 306
    if-eqz v0, :cond_14

    .line 307
    .line 308
    const/4 v1, 0x0

    .line 309
    const/4 v2, 0x1

    .line 310
    if-eq v0, v2, :cond_13

    .line 311
    .line 312
    new-instance v0, Ljava/util/ArrayList;

    .line 313
    .line 314
    array-length v2, p1

    .line 315
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 316
    .line 317
    .line 318
    array-length v2, p1

    .line 319
    :goto_4
    if-ge v1, v2, :cond_15

    .line 320
    .line 321
    aget-wide v3, p1, v1

    .line 322
    .line 323
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    add-int/lit8 v1, v1, 0x1

    .line 331
    .line 332
    goto :goto_4

    .line 333
    :cond_13
    aget-wide v0, p1, v1

    .line 334
    .line 335
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    invoke-static {p1}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    goto :goto_5

    .line 344
    :cond_14
    sget-object v0, Lvb/r;->a:Lvb/r;

    .line 345
    .line 346
    :cond_15
    :goto_5
    sget-object p1, Lvc/k;->l:Lvc/k;

    .line 347
    .line 348
    invoke-static {v0, p0, p1}, Lge/h;->a(Ljava/util/List;Lyc/y;Lvc/k;)Lge/b;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    return-object p0

    .line 353
    :cond_16
    instance-of v0, p1, [C

    .line 354
    .line 355
    if-eqz v0, :cond_19

    .line 356
    .line 357
    check-cast p1, [C

    .line 358
    .line 359
    array-length v0, p1

    .line 360
    if-eqz v0, :cond_18

    .line 361
    .line 362
    if-eq v0, v2, :cond_17

    .line 363
    .line 364
    new-instance v1, Ljava/util/ArrayList;

    .line 365
    .line 366
    array-length v0, p1

    .line 367
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 368
    .line 369
    .line 370
    array-length v0, p1

    .line 371
    :goto_6
    if-ge v3, v0, :cond_18

    .line 372
    .line 373
    aget-char v2, p1, v3

    .line 374
    .line 375
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    add-int/lit8 v3, v3, 0x1

    .line 383
    .line 384
    goto :goto_6

    .line 385
    :cond_17
    aget-char p1, p1, v3

    .line 386
    .line 387
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-static {p1}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    :cond_18
    sget-object p1, Lvc/k;->g:Lvc/k;

    .line 396
    .line 397
    invoke-static {v1, p0, p1}, Lge/h;->a(Ljava/util/List;Lyc/y;Lvc/k;)Lge/b;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    return-object p0

    .line 402
    :cond_19
    instance-of v0, p1, [F

    .line 403
    .line 404
    if-eqz v0, :cond_1d

    .line 405
    .line 406
    check-cast p1, [F

    .line 407
    .line 408
    const-string v0, "<this>"

    .line 409
    .line 410
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    array-length v0, p1

    .line 414
    if-eqz v0, :cond_1b

    .line 415
    .line 416
    const/4 v1, 0x0

    .line 417
    const/4 v2, 0x1

    .line 418
    if-eq v0, v2, :cond_1a

    .line 419
    .line 420
    new-instance v0, Ljava/util/ArrayList;

    .line 421
    .line 422
    array-length v2, p1

    .line 423
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 424
    .line 425
    .line 426
    array-length v2, p1

    .line 427
    :goto_7
    if-ge v1, v2, :cond_1c

    .line 428
    .line 429
    aget v3, p1, v1

    .line 430
    .line 431
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    add-int/lit8 v1, v1, 0x1

    .line 439
    .line 440
    goto :goto_7

    .line 441
    :cond_1a
    aget p1, p1, v1

    .line 442
    .line 443
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    invoke-static {p1}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    goto :goto_8

    .line 452
    :cond_1b
    sget-object v0, Lvb/r;->a:Lvb/r;

    .line 453
    .line 454
    :cond_1c
    :goto_8
    sget-object p1, Lvc/k;->k:Lvc/k;

    .line 455
    .line 456
    invoke-static {v0, p0, p1}, Lge/h;->a(Ljava/util/List;Lyc/y;Lvc/k;)Lge/b;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    return-object p0

    .line 461
    :cond_1d
    instance-of v0, p1, [D

    .line 462
    .line 463
    if-eqz v0, :cond_20

    .line 464
    .line 465
    check-cast p1, [D

    .line 466
    .line 467
    array-length v0, p1

    .line 468
    if-eqz v0, :cond_1f

    .line 469
    .line 470
    if-eq v0, v2, :cond_1e

    .line 471
    .line 472
    new-instance v1, Ljava/util/ArrayList;

    .line 473
    .line 474
    array-length v0, p1

    .line 475
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 476
    .line 477
    .line 478
    array-length v0, p1

    .line 479
    :goto_9
    if-ge v3, v0, :cond_1f

    .line 480
    .line 481
    aget-wide v4, p1, v3

    .line 482
    .line 483
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    add-int/lit8 v3, v3, 0x1

    .line 491
    .line 492
    goto :goto_9

    .line 493
    :cond_1e
    aget-wide v0, p1, v3

    .line 494
    .line 495
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    invoke-static {p1}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    :cond_1f
    sget-object p1, Lvc/k;->m:Lvc/k;

    .line 504
    .line 505
    invoke-static {v1, p0, p1}, Lge/h;->a(Ljava/util/List;Lyc/y;Lvc/k;)Lge/b;

    .line 506
    .line 507
    .line 508
    move-result-object p0

    .line 509
    return-object p0

    .line 510
    :cond_20
    instance-of v0, p1, [Z

    .line 511
    .line 512
    if-eqz v0, :cond_24

    .line 513
    .line 514
    check-cast p1, [Z

    .line 515
    .line 516
    const-string v0, "<this>"

    .line 517
    .line 518
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    array-length v0, p1

    .line 522
    if-eqz v0, :cond_22

    .line 523
    .line 524
    const/4 v1, 0x0

    .line 525
    const/4 v2, 0x1

    .line 526
    if-eq v0, v2, :cond_21

    .line 527
    .line 528
    new-instance v0, Ljava/util/ArrayList;

    .line 529
    .line 530
    array-length v2, p1

    .line 531
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 532
    .line 533
    .line 534
    array-length v2, p1

    .line 535
    :goto_a
    if-ge v1, v2, :cond_23

    .line 536
    .line 537
    aget-boolean v3, p1, v1

    .line 538
    .line 539
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    add-int/lit8 v1, v1, 0x1

    .line 547
    .line 548
    goto :goto_a

    .line 549
    :cond_21
    aget-boolean p1, p1, v1

    .line 550
    .line 551
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 552
    .line 553
    .line 554
    move-result-object p1

    .line 555
    invoke-static {p1}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    goto :goto_b

    .line 560
    :cond_22
    sget-object v0, Lvb/r;->a:Lvb/r;

    .line 561
    .line 562
    :cond_23
    :goto_b
    sget-object p1, Lvc/k;->f:Lvc/k;

    .line 563
    .line 564
    invoke-static {v0, p0, p1}, Lge/h;->a(Ljava/util/List;Lyc/y;Lvc/k;)Lge/b;

    .line 565
    .line 566
    .line 567
    move-result-object p0

    .line 568
    return-object p0

    .line 569
    :cond_24
    const/4 p0, 0x0

    .line 570
    if-nez p1, :cond_25

    .line 571
    .line 572
    new-instance p1, Lge/u;

    .line 573
    .line 574
    invoke-direct {p1, p0}, Lge/g;-><init>(Ljava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    return-object p1

    .line 578
    :cond_25
    return-object p0
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
.end method
