.class public final Lpd/e;
.super Ljava/lang/Object;

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final b:Lpd/f;


# direct methods
.method public synthetic constructor <init>(Lpd/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpd/e;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lpd/e;->b:Lpd/f;

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
    .locals 6

    .line 1
    iget v0, p0, Lpd/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpd/e;->b:Lpd/f;

    .line 7
    .line 8
    iget-object v1, v0, Lpd/f;->b:Led/e;

    .line 9
    .line 10
    invoke-virtual {v1}, Led/e;->b()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_3

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lsd/a;

    .line 34
    .line 35
    move-object v4, v3

    .line 36
    check-cast v4, Led/f;

    .line 37
    .line 38
    iget-object v4, v4, Led/f;->a:Lbe/e;

    .line 39
    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    sget-object v4, Lld/w;->b:Lbe/e;

    .line 43
    .line 44
    :cond_1
    invoke-virtual {v0, v3}, Lpd/f;->d(Lsd/a;)Lge/g;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    new-instance v5, Lub/k;

    .line 51
    .line 52
    invoke-direct {v5, v4, v3}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const/4 v5, 0x0

    .line 57
    :goto_1
    if-eqz v5, :cond_0

    .line 58
    .line 59
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-static {v2}, Lvb/w;->A(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0

    .line 68
    :pswitch_0
    iget-object v0, p0, Lpd/e;->b:Lpd/f;

    .line 69
    .line 70
    invoke-virtual {v0}, Lpd/f;->a()Lbe/c;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v2, v0, Lpd/f;->b:Led/e;

    .line 75
    .line 76
    iget-object v0, v0, Lpd/f;->a:Lb0/w1;

    .line 77
    .line 78
    if-nez v1, :cond_4

    .line 79
    .line 80
    invoke-virtual {v2}, Led/e;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    filled-new-array {v0}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sget-object v1, Lue/k;->E:Lue/k;

    .line 89
    .line 90
    invoke-static {v1, v0}, Lue/l;->c(Lue/k;[Ljava/lang/String;)Lue/i;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    goto :goto_3

    .line 95
    :cond_4
    iget-object v0, v0, Lb0/w1;->c:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Lod/a;

    .line 98
    .line 99
    iget-object v3, v0, Lod/a;->o:Lyc/y;

    .line 100
    .line 101
    invoke-interface {v3}, Lyc/y;->g()Lvc/i;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-static {v1, v4}, Lxc/e;->b(Lbe/c;Lvc/i;)Lyc/e;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    if-nez v4, :cond_6

    .line 110
    .line 111
    new-instance v4, Led/o;

    .line 112
    .line 113
    iget-object v2, v2, Led/e;->a:Ljava/lang/annotation/Annotation;

    .line 114
    .line 115
    invoke-static {v2}, Lg8/a;->y(Ljava/lang/annotation/Annotation;)Lpc/c;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-static {v2}, Lg8/a;->D(Lpc/c;)Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-direct {v4, v2}, Led/o;-><init>(Ljava/lang/Class;)V

    .line 124
    .line 125
    .line 126
    iget-object v2, v0, Lod/a;->k:Li7/p2;

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget-object v2, v2, Li7/p2;->a:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v2, Li7/p2;

    .line 134
    .line 135
    if-eqz v2, :cond_5

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Li7/p2;->D(Led/o;)Lyc/e;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    if-nez v4, :cond_6

    .line 142
    .line 143
    new-instance v2, Lbe/b;

    .line 144
    .line 145
    invoke-virtual {v1}, Lbe/c;->b()Lbe/c;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    iget-object v1, v1, Lbe/c;->a:Lbe/d;

    .line 150
    .line 151
    invoke-virtual {v1}, Lbe/d;->g()Lbe/e;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-direct {v2, v4, v1}, Lbe/b;-><init>(Lbe/c;Lbe/e;)V

    .line 156
    .line 157
    .line 158
    iget-object v0, v0, Lod/a;->d:Lud/g;

    .line 159
    .line 160
    invoke-virtual {v0}, Lud/g;->c()Loe/i;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iget-object v0, v0, Loe/i;->l:Lb0/w1;

    .line 165
    .line 166
    invoke-static {v3, v2, v0}, Lyc/v;->f(Lyc/y;Lbe/b;Lb0/w1;)Lyc/e;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    goto :goto_2

    .line 171
    :cond_5
    const-string v0, "resolver"

    .line 172
    .line 173
    invoke-static {v0}, Ljc/l;->k(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    const/4 v0, 0x0

    .line 177
    throw v0

    .line 178
    :cond_6
    :goto_2
    invoke-interface {v4}, Lyc/e;->E()Lse/a0;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    :goto_3
    return-object v0

    .line 183
    :pswitch_1
    iget-object v0, p0, Lpd/e;->b:Lpd/f;

    .line 184
    .line 185
    iget-object v0, v0, Lpd/f;->b:Led/e;

    .line 186
    .line 187
    iget-object v0, v0, Led/e;->a:Ljava/lang/annotation/Annotation;

    .line 188
    .line 189
    invoke-static {v0}, Lg8/a;->y(Ljava/lang/annotation/Annotation;)Lpc/c;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {v0}, Lg8/a;->D(Lpc/c;)Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-static {v0}, Led/d;->a(Ljava/lang/Class;)Lbe/b;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0}, Lbe/b;->a()Lbe/c;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    return-object v0

    .line 206
    nop

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
