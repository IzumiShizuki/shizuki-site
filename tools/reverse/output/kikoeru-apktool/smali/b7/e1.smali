.class public final synthetic Lb7/e1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb7/h1;
.implements Lp4/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lb7/e1;->a:I

    iput-object p3, p0, Lb7/e1;->c:Ljava/lang/Object;

    iput p1, p0, Lb7/e1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILya/a1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lb7/e1;->a:I

    iput p1, p0, Lb7/e1;->b:I

    iput-object p2, p0, Lb7/e1;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lb7/e1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb7/e1;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lm4/i0;

    .line 9
    .line 10
    iget v1, p0, Lb7/e1;->b:I

    .line 11
    .line 12
    check-cast p1, Lm4/w0;

    .line 13
    .line 14
    invoke-interface {p1, v0, v1}, Lm4/w0;->D(Lm4/i0;I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lb7/e1;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lv4/u0;

    .line 21
    .line 22
    check-cast p1, Lm4/w0;

    .line 23
    .line 24
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 25
    .line 26
    iget v1, p0, Lb7/e1;->b:I

    .line 27
    .line 28
    invoke-interface {p1, v0, v1}, Lm4/w0;->m(Lm4/i1;I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
    .line 34
    .line 35
    .line 36
.end method

.method public c(Lb7/t0;)V
    .locals 10

    .line 1
    iget v0, p0, Lb7/e1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb7/e1;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p1}, Lb7/t0;->T()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p1, Lb7/t0;->q:Lya/a1;

    .line 18
    .line 19
    iget-object v2, p1, Lb7/t0;->r:Lya/a1;

    .line 20
    .line 21
    invoke-static {v0}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iput-object v3, p1, Lb7/t0;->o:Lya/i0;

    .line 26
    .line 27
    iget-object v3, p1, Lb7/t0;->p:Lya/i0;

    .line 28
    .line 29
    iget-object v4, p1, Lb7/t0;->s:Lb7/f4;

    .line 30
    .line 31
    iget-object v5, p1, Lb7/t0;->v:Lm4/u0;

    .line 32
    .line 33
    iget-object v6, p1, Lb7/t0;->C:Landroid/os/Bundle;

    .line 34
    .line 35
    invoke-static {v3, v0, v4, v5, v6}, Lb7/t0;->n(Ljava/util/List;Ljava/util/List;Lb7/f4;Lm4/u0;Landroid/os/Bundle;)Lya/a1;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iput-object v3, p1, Lb7/t0;->q:Lya/a1;

    .line 40
    .line 41
    iget-object v4, p1, Lb7/t0;->C:Landroid/os/Bundle;

    .line 42
    .line 43
    iget-object v5, p1, Lb7/t0;->s:Lb7/f4;

    .line 44
    .line 45
    iget-object v6, p1, Lb7/t0;->v:Lm4/u0;

    .line 46
    .line 47
    invoke-static {v3, v0, v4, v5, v6}, Lb7/t0;->m(Lya/a1;Ljava/util/List;Landroid/os/Bundle;Lb7/f4;Lm4/u0;)Lya/a1;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p1, Lb7/t0;->r:Lya/a1;

    .line 52
    .line 53
    iget-object v0, p1, Lb7/t0;->q:Lya/a1;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lya/i0;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    xor-int/lit8 v6, v0, 0x1

    .line 60
    .line 61
    iget-object v0, p1, Lb7/t0;->r:Lya/a1;

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Lya/i0;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    xor-int/lit8 v5, v0, 0x1

    .line 68
    .line 69
    iget-object v0, p1, Lb7/t0;->a:Lb7/d0;

    .line 70
    .line 71
    new-instance v3, Lb7/o0;

    .line 72
    .line 73
    const/4 v8, 0x1

    .line 74
    iget v7, p0, Lb7/e1;->b:I

    .line 75
    .line 76
    move-object v4, p1

    .line 77
    invoke-direct/range {v3 .. v8}, Lb7/o0;-><init>(Lb7/t0;ZZII)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v3}, Lb7/d0;->b(Lp4/g;)V

    .line 81
    .line 82
    .line 83
    :goto_0
    return-void

    .line 84
    :pswitch_0
    move-object v4, p1

    .line 85
    iget-object p1, p0, Lb7/e1;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Lya/i0;

    .line 88
    .line 89
    invoke-virtual {v4}, Lb7/t0;->T()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    iget-object v0, v4, Lb7/t0;->q:Lya/a1;

    .line 97
    .line 98
    iget-object v1, v4, Lb7/t0;->r:Lya/a1;

    .line 99
    .line 100
    invoke-static {p1}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iput-object v2, v4, Lb7/t0;->p:Lya/i0;

    .line 105
    .line 106
    iget-object v2, v4, Lb7/t0;->o:Lya/i0;

    .line 107
    .line 108
    iget-object v3, v4, Lb7/t0;->s:Lb7/f4;

    .line 109
    .line 110
    iget-object v5, v4, Lb7/t0;->v:Lm4/u0;

    .line 111
    .line 112
    iget-object v6, v4, Lb7/t0;->C:Landroid/os/Bundle;

    .line 113
    .line 114
    invoke-static {p1, v2, v3, v5, v6}, Lb7/t0;->n(Ljava/util/List;Ljava/util/List;Lb7/f4;Lm4/u0;Landroid/os/Bundle;)Lya/a1;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iput-object p1, v4, Lb7/t0;->q:Lya/a1;

    .line 119
    .line 120
    iget-object v2, v4, Lb7/t0;->o:Lya/i0;

    .line 121
    .line 122
    iget-object v3, v4, Lb7/t0;->C:Landroid/os/Bundle;

    .line 123
    .line 124
    iget-object v5, v4, Lb7/t0;->s:Lb7/f4;

    .line 125
    .line 126
    iget-object v6, v4, Lb7/t0;->v:Lm4/u0;

    .line 127
    .line 128
    invoke-static {p1, v2, v3, v5, v6}, Lb7/t0;->m(Lya/a1;Ljava/util/List;Landroid/os/Bundle;Lb7/f4;Lm4/u0;)Lya/a1;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iput-object p1, v4, Lb7/t0;->r:Lya/a1;

    .line 133
    .line 134
    iget-object p1, v4, Lb7/t0;->q:Lya/a1;

    .line 135
    .line 136
    invoke-virtual {p1, v0}, Lya/i0;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    xor-int/lit8 v7, p1, 0x1

    .line 141
    .line 142
    iget-object p1, v4, Lb7/t0;->r:Lya/a1;

    .line 143
    .line 144
    invoke-virtual {p1, v1}, Lya/i0;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    xor-int/lit8 v6, p1, 0x1

    .line 149
    .line 150
    iget-object p1, v4, Lb7/t0;->a:Lb7/d0;

    .line 151
    .line 152
    move-object v5, v4

    .line 153
    new-instance v4, Lb7/o0;

    .line 154
    .line 155
    const/4 v9, 0x0

    .line 156
    iget v8, p0, Lb7/e1;->b:I

    .line 157
    .line 158
    invoke-direct/range {v4 .. v9}, Lb7/o0;-><init>(Lb7/t0;ZZII)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v4}, Lb7/d0;->b(Lp4/g;)V

    .line 162
    .line 163
    .line 164
    :goto_1
    return-void

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
