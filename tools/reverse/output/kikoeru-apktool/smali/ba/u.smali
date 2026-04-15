.class public final Lba/u;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbd/k;Lre/o;Lyc/n0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lba/u;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/u;->d:Ljava/lang/Object;

    iput-object p2, p0, Lba/u;->b:Ljava/lang/Object;

    iput-object p3, p0, Lba/u;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lba/u;->a:I

    iput-object p1, p0, Lba/u;->b:Ljava/lang/Object;

    iput-object p2, p0, Lba/u;->c:Ljava/lang/Object;

    iput-object p3, p0, Lba/u;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lba/u;->a:I

    .line 2
    .line 3
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lba/u;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Lba/u;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, p0, Lba/u;->d:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v5, Lhg/b;

    .line 16
    .line 17
    check-cast v4, Ljava/util/List;

    .line 18
    .line 19
    check-cast v3, Lx0/w0;

    .line 20
    .line 21
    sget-object v0, Lz8/i;->a:[Lpc/u;

    .line 22
    .line 23
    invoke-interface {v3}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    float-to-int v0, v0

    .line 34
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lub/k;

    .line 39
    .line 40
    iget-object v0, v0, Lub/k;->a:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object v3, Lz8/i;->a:[Lpc/u;

    .line 43
    .line 44
    aget-object v2, v3, v2

    .line 45
    .line 46
    invoke-virtual {v5, v0, v2}, Lhg/b;->e(Ljava/lang/Object;Lpc/u;)V

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :pswitch_0
    check-cast v4, Lse/w;

    .line 51
    .line 52
    check-cast v3, Lsc/a0;

    .line 53
    .line 54
    check-cast v5, Lsc/d0;

    .line 55
    .line 56
    invoke-virtual {v4}, Lse/w;->t()Lse/k0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0}, Lse/k0;->h()Lyc/h;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    instance-of v1, v0, Lyc/e;

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    move-object v1, v0

    .line 69
    check-cast v1, Lyc/e;

    .line 70
    .line 71
    invoke-static {v1}, Lsc/f2;->j(Lyc/e;)Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    iget-object v2, v5, Lsc/d0;->b:Ljava/lang/Class;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-static {v4, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_0

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    const-string v5, "getInterfaces(...)"

    .line 102
    .line 103
    invoke-static {v4, v5}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v4}, Lvb/l;->A0(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-ltz v1, :cond_1

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    aget-object v0, v0, v1

    .line 117
    .line 118
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :goto_0
    return-object v0

    .line 122
    :cond_1
    new-instance v1, Lhc/a;

    .line 123
    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v4, "No superclass of "

    .line 127
    .line 128
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v3, " in Java reflection for "

    .line 135
    .line 136
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-direct {v1, v0}, Lhc/a;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v1

    .line 150
    :cond_2
    new-instance v1, Lhc/a;

    .line 151
    .line 152
    new-instance v2, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-string v4, "Unsupported superclass of "

    .line 155
    .line 156
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v3, ": "

    .line 163
    .line 164
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-direct {v1, v0}, Lhc/a;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v1

    .line 178
    :cond_3
    new-instance v1, Lhc/a;

    .line 179
    .line 180
    new-instance v2, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v3, "Supertype not a class: "

    .line 183
    .line 184
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-direct {v1, v0}, Lhc/a;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v1

    .line 198
    :pswitch_1
    check-cast v4, Lce/y;

    .line 199
    .line 200
    check-cast v3, Ljava/io/ByteArrayInputStream;

    .line 201
    .line 202
    check-cast v5, Lqe/o;

    .line 203
    .line 204
    iget-object v0, v5, Lqe/o;->b:Loe/k;

    .line 205
    .line 206
    iget-object v0, v0, Loe/k;->a:Loe/i;

    .line 207
    .line 208
    iget-object v0, v0, Loe/i;->p:Lce/i;

    .line 209
    .line 210
    check-cast v4, Lce/c;

    .line 211
    .line 212
    invoke-virtual {v4, v3, v0}, Lce/c;->c(Ljava/io/ByteArrayInputStream;Lce/i;)Lce/b;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    return-object v0

    .line 217
    :pswitch_2
    new-instance v0, Lbd/j;

    .line 218
    .line 219
    check-cast v5, Lbd/k;

    .line 220
    .line 221
    check-cast v4, Lre/o;

    .line 222
    .line 223
    check-cast v3, Lyc/n0;

    .line 224
    .line 225
    invoke-direct {v0, v5, v4, v3}, Lbd/j;-><init>(Lbd/k;Lre/o;Lyc/n0;)V

    .line 226
    .line 227
    .line 228
    return-object v0

    .line 229
    :pswitch_3
    check-cast v5, Lx0/n2;

    .line 230
    .line 231
    check-cast v4, Ljava/lang/String;

    .line 232
    .line 233
    const-string v0, " "

    .line 234
    .line 235
    invoke-static {v4, v0, v2}, Lef/n;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-eqz v2, :cond_4

    .line 240
    .line 241
    const-string v2, "\""

    .line 242
    .line 243
    invoke-static {v2, v4, v2}, Lq/t0;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    :cond_4
    invoke-interface {v5}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    check-cast v2, Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-nez v2, :cond_5

    .line 258
    .line 259
    goto :goto_1

    .line 260
    :cond_5
    invoke-interface {v5}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    check-cast v2, Ljava/lang/String;

    .line 265
    .line 266
    invoke-static {v2, v0, v4}, Lj2/h0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    :goto_1
    check-cast v3, Lx0/w0;

    .line 271
    .line 272
    new-instance v0, Ly2/y;

    .line 273
    .line 274
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    invoke-static {v2, v2}, Lt2/c0;->b(II)J

    .line 279
    .line 280
    .line 281
    move-result-wide v5

    .line 282
    const/4 v2, 0x4

    .line 283
    invoke-direct {v0, v5, v6, v4, v2}, Ly2/y;-><init>(JLjava/lang/String;I)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    return-object v1

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
