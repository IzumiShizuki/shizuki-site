.class public final Lsc/y0;
.super Ljava/lang/Object;

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final b:Lsc/a1;


# direct methods
.method public synthetic constructor <init>(Lsc/a1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsc/y0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lsc/y0;->b:Lsc/a1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lsc/y0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lsc/y0;->b:Lsc/a1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lsc/a1;->a()Lyc/i0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v2, v1, Lsc/a1;->b:I

    .line 13
    .line 14
    iget-object v1, v1, Lsc/a1;->a:Lsc/u;

    .line 15
    .line 16
    instance-of v3, v0, Lbd/a0;

    .line 17
    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    invoke-virtual {v1}, Lsc/u;->r()Lyc/c;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    sget-object v4, Lsc/f2;->a:Lbe/c;

    .line 25
    .line 26
    invoke-interface {v3}, Lyc/b;->s0()Lbd/a0;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-interface {v3}, Lyc/k;->y()Lyc/k;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3, v5}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    check-cast v3, Lyc/e;

    .line 42
    .line 43
    invoke-interface {v3}, Lyc/e;->T0()Lbd/a0;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v3, 0x0

    .line 49
    :goto_0
    invoke-static {v3, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-virtual {v1}, Lsc/u;->r()Lyc/c;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v3}, Lyc/c;->j()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    const/4 v4, 0x2

    .line 64
    if-ne v3, v4, :cond_2

    .line 65
    .line 66
    invoke-virtual {v1}, Lsc/u;->r()Lyc/c;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {v1}, Lyc/k;->y()Lyc/k;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1, v5}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    check-cast v1, Lyc/e;

    .line 78
    .line 79
    invoke-static {v1}, Lsc/f2;->j(Lyc/e;)Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    goto/16 :goto_2

    .line 86
    .line 87
    :cond_1
    new-instance v1, Lhc/a;

    .line 88
    .line 89
    new-instance v2, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v3, "Cannot determine receiver Java type of inherited declaration: "

    .line 92
    .line 93
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-direct {v1, v0}, Lhc/a;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v1

    .line 107
    :cond_2
    invoke-virtual {v1}, Lsc/u;->i()Ltc/g;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    instance-of v3, v0, Ltc/d0;

    .line 112
    .line 113
    const-string v4, "Expected at least 1 type for compound type"

    .line 114
    .line 115
    const/4 v5, 0x0

    .line 116
    const/4 v6, 0x1

    .line 117
    if-eqz v3, :cond_6

    .line 118
    .line 119
    invoke-virtual {v1}, Lsc/u;->t()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_3

    .line 124
    .line 125
    check-cast v0, Ltc/d0;

    .line 126
    .line 127
    add-int/2addr v2, v6

    .line 128
    invoke-virtual {v0, v2}, Ltc/d0;->e(I)Loc/d;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v0, v5}, Ltc/d0;->e(I)Loc/d;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    iget v2, v2, Loc/b;->b:I

    .line 137
    .line 138
    add-int/2addr v2, v6

    .line 139
    iget-object v0, v0, Ltc/d0;->b:Ltc/g;

    .line 140
    .line 141
    invoke-interface {v0}, Ltc/g;->a()Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v3, Loc/d;

    .line 146
    .line 147
    iget v7, v1, Loc/b;->a:I

    .line 148
    .line 149
    sub-int/2addr v7, v2

    .line 150
    iget v1, v1, Loc/b;->b:I

    .line 151
    .line 152
    sub-int/2addr v1, v2

    .line 153
    invoke-direct {v3, v7, v1, v6}, Loc/b;-><init>(III)V

    .line 154
    .line 155
    .line 156
    invoke-static {v0, v3}, Lvb/m;->A0(Ljava/util/List;Loc/d;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    goto :goto_1

    .line 161
    :cond_3
    check-cast v0, Ltc/d0;

    .line 162
    .line 163
    invoke-virtual {v0, v2}, Ltc/d0;->e(I)Loc/d;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iget-object v0, v0, Ltc/d0;->b:Ltc/g;

    .line 168
    .line 169
    invoke-interface {v0}, Ltc/g;->a()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-static {v0, v1}, Lvb/m;->A0(Ljava/util/List;Loc/d;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    :goto_1
    check-cast v0, Ljava/util/Collection;

    .line 178
    .line 179
    new-array v1, v5, [Ljava/lang/reflect/Type;

    .line 180
    .line 181
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, [Ljava/lang/reflect/Type;

    .line 186
    .line 187
    array-length v1, v0

    .line 188
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, [Ljava/lang/reflect/Type;

    .line 193
    .line 194
    array-length v1, v0

    .line 195
    if-eqz v1, :cond_5

    .line 196
    .line 197
    if-eq v1, v6, :cond_4

    .line 198
    .line 199
    new-instance v1, Lsc/z0;

    .line 200
    .line 201
    invoke-direct {v1, v0}, Lsc/z0;-><init>([Ljava/lang/reflect/Type;)V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_4
    invoke-static {v0}, Lvb/l;->I0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    move-object v1, v0

    .line 210
    check-cast v1, Ljava/lang/reflect/Type;

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_5
    new-instance v0, Lhc/a;

    .line 214
    .line 215
    invoke-direct {v0, v4}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v0

    .line 219
    :cond_6
    instance-of v1, v0, Ltc/c0;

    .line 220
    .line 221
    if-eqz v1, :cond_9

    .line 222
    .line 223
    check-cast v0, Ltc/c0;

    .line 224
    .line 225
    iget-object v0, v0, Ltc/c0;->d:Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Ljava/util/Collection;

    .line 232
    .line 233
    new-array v1, v5, [Ljava/lang/Class;

    .line 234
    .line 235
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, [Ljava/lang/Class;

    .line 240
    .line 241
    array-length v1, v0

    .line 242
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    check-cast v0, [Ljava/lang/reflect/Type;

    .line 247
    .line 248
    array-length v1, v0

    .line 249
    if-eqz v1, :cond_8

    .line 250
    .line 251
    if-eq v1, v6, :cond_7

    .line 252
    .line 253
    new-instance v1, Lsc/z0;

    .line 254
    .line 255
    invoke-direct {v1, v0}, Lsc/z0;-><init>([Ljava/lang/reflect/Type;)V

    .line 256
    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_7
    invoke-static {v0}, Lvb/l;->I0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    move-object v1, v0

    .line 264
    check-cast v1, Ljava/lang/reflect/Type;

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_8
    new-instance v0, Lhc/a;

    .line 268
    .line 269
    invoke-direct {v0, v4}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v0

    .line 273
    :cond_9
    invoke-interface {v0}, Ltc/g;->a()Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    move-object v1, v0

    .line 282
    check-cast v1, Ljava/lang/reflect/Type;

    .line 283
    .line 284
    :goto_2
    return-object v1

    .line 285
    :pswitch_0
    invoke-virtual {v1}, Lsc/a1;->a()Lyc/i0;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-static {v0}, Lsc/f2;->d(Lyc/b;)Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    return-object v0

    .line 294
    nop

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
