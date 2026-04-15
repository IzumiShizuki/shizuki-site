.class public final Lj0/e;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lj0/f;


# direct methods
.method public synthetic constructor <init>(Lj0/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj0/e;->b:I

    iput-object p1, p0, Lj0/e;->c:Lj0/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lj0/f;Lq2/k;)V
    .locals 0

    const/4 p2, 0x3

    iput p2, p0, Lj0/e;->b:I

    .line 2
    iput-object p1, p0, Lj0/e;->c:Lj0/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lj0/e;->b:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lj0/e;->c:Lj0/f;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lt2/g;

    .line 11
    .line 12
    iget-boolean v0, v3, Lj0/f;->t:Z

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    iget-boolean v0, v3, Lj0/f;->u:Z

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, v3, Lj0/f;->s:Lh0/u0;

    .line 22
    .line 23
    iget-object v0, v0, Lh0/u0;->e:Ly2/c0;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    new-instance v5, Ly2/h;

    .line 29
    .line 30
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v6, Ly2/a;

    .line 34
    .line 35
    invoke-direct {v6, p1, v2}, Ly2/a;-><init>(Lt2/g;I)V

    .line 36
    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    new-array v7, v7, [Ly2/g;

    .line 40
    .line 41
    aput-object v5, v7, v1

    .line 42
    .line 43
    aput-object v6, v7, v2

    .line 44
    .line 45
    invoke-static {v7}, Lud/b;->x([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v2, v3, Lj0/f;->s:Lh0/u0;

    .line 50
    .line 51
    iget-object v5, v2, Lh0/u0;->d:Lv2/e;

    .line 52
    .line 53
    iget-object v2, v2, Lh0/u0;->v:Lh0/x;

    .line 54
    .line 55
    invoke-virtual {v5, v1}, Lv2/e;->l(Ljava/util/List;)Ly2/y;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v4, v1}, Ly2/c0;->a(Ly2/y;Ly2/y;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v1}, Lh0/x;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    sget-object v4, Lub/a0;->a:Lub/a0;

    .line 66
    .line 67
    :cond_1
    if-nez v4, :cond_2

    .line 68
    .line 69
    iget-object v0, v3, Lj0/f;->r:Ly2/y;

    .line 70
    .line 71
    iget-object v1, v0, Ly2/y;->a:Lt2/g;

    .line 72
    .line 73
    iget-object v1, v1, Lt2/g;->b:Ljava/lang/String;

    .line 74
    .line 75
    iget-wide v4, v0, Ly2/y;->b:J

    .line 76
    .line 77
    sget v0, Lt2/k0;->c:I

    .line 78
    .line 79
    const/16 v0, 0x20

    .line 80
    .line 81
    shr-long v6, v4, v0

    .line 82
    .line 83
    long-to-int v2, v6

    .line 84
    const-wide v6, 0xffffffffL

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long/2addr v4, v6

    .line 90
    long-to-int v5, v4

    .line 91
    invoke-static {v1, v2, v5, p1}, Lef/n;->H0(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-object v2, v3, Lj0/f;->r:Ly2/y;

    .line 100
    .line 101
    iget-wide v4, v2, Ly2/y;->b:J

    .line 102
    .line 103
    shr-long/2addr v4, v0

    .line 104
    long-to-int v0, v4

    .line 105
    iget-object p1, p1, Lt2/g;->b:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    add-int/2addr p1, v0

    .line 112
    invoke-static {p1, p1}, Lt2/c0;->b(II)J

    .line 113
    .line 114
    .line 115
    move-result-wide v4

    .line 116
    iget-object p1, v3, Lj0/f;->s:Lh0/u0;

    .line 117
    .line 118
    iget-object p1, p1, Lh0/u0;->v:Lh0/x;

    .line 119
    .line 120
    new-instance v0, Ly2/y;

    .line 121
    .line 122
    const/4 v2, 0x4

    .line 123
    invoke-direct {v0, v4, v5, v1, v2}, Ly2/y;-><init>(JLjava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v0}, Lh0/x;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    :cond_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 133
    .line 134
    :goto_1
    return-object p1

    .line 135
    :pswitch_0
    check-cast p1, Lt2/g;

    .line 136
    .line 137
    iget-object v0, v3, Lj0/f;->s:Lh0/u0;

    .line 138
    .line 139
    iget-object p1, p1, Lt2/g;->b:Ljava/lang/String;

    .line 140
    .line 141
    iget-boolean v1, v3, Lj0/f;->t:Z

    .line 142
    .line 143
    iget-boolean v2, v3, Lj0/f;->u:Z

    .line 144
    .line 145
    invoke-static {v3, v0, p1, v1, v2}, Lj0/f;->E0(Lj0/f;Lh0/u0;Ljava/lang/String;ZZ)V

    .line 146
    .line 147
    .line 148
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 149
    .line 150
    return-object p1

    .line 151
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 152
    .line 153
    iget-object v0, v3, Lj0/f;->s:Lh0/u0;

    .line 154
    .line 155
    invoke-virtual {v0}, Lh0/u0;->d()Lh0/r1;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-eqz v0, :cond_4

    .line 160
    .line 161
    iget-object v0, v3, Lj0/f;->s:Lh0/u0;

    .line 162
    .line 163
    invoke-virtual {v0}, Lh0/u0;->d()Lh0/r1;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    iget-object v0, v0, Lh0/r1;->a:Lt2/i0;

    .line 171
    .line 172
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    const/4 v1, 0x1

    .line 176
    :cond_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    return-object p1

    .line 181
    :pswitch_2
    check-cast p1, Lt2/g;

    .line 182
    .line 183
    iget-object v0, v3, Lj0/f;->s:Lh0/u0;

    .line 184
    .line 185
    iget-object v0, v0, Lh0/u0;->t:Lx0/e1;

    .line 186
    .line 187
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    iget-object v0, v3, Lj0/f;->s:Lh0/u0;

    .line 193
    .line 194
    iget-object v0, v0, Lh0/u0;->s:Lx0/e1;

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    iget-object v0, v3, Lj0/f;->s:Lh0/u0;

    .line 200
    .line 201
    iget-object p1, p1, Lt2/g;->b:Ljava/lang/String;

    .line 202
    .line 203
    iget-boolean v2, v3, Lj0/f;->t:Z

    .line 204
    .line 205
    iget-boolean v4, v3, Lj0/f;->u:Z

    .line 206
    .line 207
    invoke-static {v3, v0, p1, v2, v4}, Lj0/f;->E0(Lj0/f;Lh0/u0;Ljava/lang/String;ZZ)V

    .line 208
    .line 209
    .line 210
    return-object v1

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
