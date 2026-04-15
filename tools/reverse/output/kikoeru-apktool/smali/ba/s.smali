.class public final synthetic Lba/s;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lba/s;->a:I

    iput-object p1, p0, Lba/s;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Lba/s;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Lba/s;->a:I

    iput-boolean p1, p0, Lba/s;->b:Z

    iput-object p2, p0, Lba/s;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lba/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lba/s;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lx0/w0;

    .line 9
    .line 10
    iget-boolean v1, p0, Lba/s;->b:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    xor-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v0, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    iget-object v0, p0, Lba/s;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lt0/j;

    .line 39
    .line 40
    iget-boolean v1, p0, Lba/s;->b:Z

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    iget-object v0, v0, Lt0/j;->e:Lx0/a1;

    .line 45
    .line 46
    invoke-virtual {v0}, Lx0/a1;->e()F

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/high16 v1, 0x3f000000    # 0.5f

    .line 51
    .line 52
    cmpl-float v0, v0, v1

    .line 53
    .line 54
    if-lez v0, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 v0, 0x0

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 60
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0

    .line 65
    :pswitch_1
    iget-object v0, p0, Lba/s;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lp7/e;

    .line 68
    .line 69
    iget-boolean v1, p0, Lba/s;->b:Z

    .line 70
    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    const-string v1, "reader"

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    const-string v1, "writer"

    .line 77
    .line 78
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    new-instance v3, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v4, "Timed out attempting to acquire a "

    .line 86
    .line 87
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, " connection."

    .line 94
    .line 95
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, "\n\nWriter pool:\n"

    .line 106
    .line 107
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object v1, v0, Lp7/e;->b:Lp7/j;

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Lp7/j;->d(Ljava/lang/StringBuilder;)V

    .line 113
    .line 114
    .line 115
    const-string v1, "Reader pool:"

    .line 116
    .line 117
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const/16 v1, 0xa

    .line 121
    .line 122
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    iget-object v0, v0, Lp7/e;->a:Lp7/j;

    .line 126
    .line 127
    invoke-virtual {v0, v2}, Lp7/j;->d(Ljava/lang/StringBuilder;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    const/4 v1, 0x5

    .line 135
    :try_start_0
    invoke-static {v1, v0}, Lud/n;->D(ILjava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const/4 v0, 0x0

    .line 139
    throw v0
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    :catch_0
    move-exception v0

    .line 141
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 142
    .line 143
    .line 144
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_2
    iget-object v0, p0, Lba/s;->c:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Lo1/r;

    .line 150
    .line 151
    iget-boolean v1, p0, Lba/s;->b:Z

    .line 152
    .line 153
    if-eqz v1, :cond_4

    .line 154
    .line 155
    invoke-static {v0}, Lo1/r;->b(Lo1/r;)V

    .line 156
    .line 157
    .line 158
    :cond_4
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_3
    iget-object v0, p0, Lba/s;->c:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Le/c;

    .line 164
    .line 165
    iget-boolean v1, p0, Lba/s;->b:Z

    .line 166
    .line 167
    iput-boolean v1, v0, Ld/b0;->a:Z

    .line 168
    .line 169
    iget-object v0, v0, Ld/b0;->c:Ljc/j;

    .line 170
    .line 171
    if-eqz v0, :cond_5

    .line 172
    .line 173
    invoke-interface {v0}, Lic/a;->b()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    :cond_5
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_4
    iget-object v0, p0, Lba/s;->c:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Lx0/n2;

    .line 182
    .line 183
    sget-object v1, Lb9/f;->d:Lx0/e1;

    .line 184
    .line 185
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    check-cast v1, Lka/q;

    .line 190
    .line 191
    sget-object v2, Lka/q;->d:Lka/q;

    .line 192
    .line 193
    if-eq v1, v2, :cond_6

    .line 194
    .line 195
    sget-object v0, Lvb/r;->a:Lvb/r;

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_6
    iget-boolean v1, p0, Lba/s;->b:Z

    .line 199
    .line 200
    if-eqz v1, :cond_7

    .line 201
    .line 202
    sget-object v1, Lb9/f;->a:Ljava/util/LinkedHashMap;

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_7
    sget-object v1, Lb9/f;->b:Ljava/util/LinkedHashMap;

    .line 206
    .line 207
    :goto_3
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    check-cast v1, Ljava/lang/Iterable;

    .line 212
    .line 213
    new-instance v2, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-eqz v3, :cond_9

    .line 227
    .line 228
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    move-object v4, v3

    .line 233
    check-cast v4, Ljava/lang/String;

    .line 234
    .line 235
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    check-cast v5, Ljava/lang/String;

    .line 240
    .line 241
    const/4 v6, 0x1

    .line 242
    invoke-static {v4, v5, v6}, Lef/n;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-eqz v4, :cond_8

    .line 247
    .line 248
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_9
    move-object v0, v2

    .line 253
    :goto_5
    return-object v0

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
