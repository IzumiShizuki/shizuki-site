.class public final Lu9/a;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lfg/f;

.field public final synthetic g:Lx0/w0;


# direct methods
.method public constructor <init>(Lfg/f;Lx0/w0;Lyb/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lu9/a;->e:I

    .line 1
    iput-object p1, p0, Lu9/a;->f:Lfg/f;

    iput-object p2, p0, Lu9/a;->g:Lx0/w0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lx0/w0;Lfg/f;Lyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lu9/a;->e:I

    .line 2
    iput-object p1, p0, Lu9/a;->g:Lx0/w0;

    iput-object p2, p0, Lu9/a;->f:Lfg/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 2

    .line 1
    iget p1, p0, Lu9/a;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lu9/a;

    .line 7
    .line 8
    iget-object v0, p0, Lu9/a;->f:Lfg/f;

    .line 9
    .line 10
    iget-object v1, p0, Lu9/a;->g:Lx0/w0;

    .line 11
    .line 12
    invoke-direct {p1, v0, v1, p2}, Lu9/a;-><init>(Lfg/f;Lx0/w0;Lyb/c;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, Lu9/a;

    .line 17
    .line 18
    iget-object v0, p0, Lu9/a;->g:Lx0/w0;

    .line 19
    .line 20
    iget-object v1, p0, Lu9/a;->f:Lfg/f;

    .line 21
    .line 22
    invoke-direct {p1, v0, v1, p2}, Lu9/a;-><init>(Lx0/w0;Lfg/f;Lyb/c;)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lu9/a;->e:I

    .line 2
    .line 3
    check-cast p1, Lhf/y;

    .line 4
    .line 5
    check-cast p2, Lyb/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lu9/a;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lu9/a;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lu9/a;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lu9/a;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lu9/a;

    .line 27
    .line 28
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lu9/a;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lu9/a;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lu9/a;->f:Lfg/f;

    .line 10
    .line 11
    invoke-virtual {p1}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/String;

    .line 16
    .line 17
    sget-object v0, Lna/w;->a:Lxf/r;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v1, Lwf/d;

    .line 23
    .line 24
    new-instance v2, Lwf/s0;

    .line 25
    .line 26
    new-instance v3, Lwf/y;

    .line 27
    .line 28
    const-string v4, "com.cnl.kikoeru.ui.screen.main.others.card.CardTags"

    .line 29
    .line 30
    invoke-static {}, Lu9/i;->values()[Lu9/i;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-direct {v3, v4, v5}, Lwf/y;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 35
    .line 36
    .line 37
    sget-object v4, Lwf/g;->a:Lwf/g;

    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    invoke-direct {v2, v3, v4, v5}, Lwf/s0;-><init>(Lsf/a;Lsf/a;I)V

    .line 41
    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-direct {v1, v2, v3}, Lwf/d;-><init>(Lsf/a;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1, v1}, Lxf/c;->a(Ljava/lang/String;Lsf/a;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ljava/util/List;

    .line 52
    .line 53
    iget-object v0, p0, Lu9/a;->g:Lx0/w0;

    .line 54
    .line 55
    invoke-interface {v0, p1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_0
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lu9/a;->g:Lx0/w0;

    .line 65
    .line 66
    invoke-interface {p1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Ljava/util/List;

    .line 71
    .line 72
    sget-object v0, Lna/w;->a:Lxf/r;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance v1, Lwf/d;

    .line 78
    .line 79
    new-instance v2, Lwf/s0;

    .line 80
    .line 81
    new-instance v3, Lwf/y;

    .line 82
    .line 83
    const-string v4, "com.cnl.kikoeru.ui.screen.main.others.card.CardTags"

    .line 84
    .line 85
    invoke-static {}, Lu9/i;->values()[Lu9/i;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-direct {v3, v4, v5}, Lwf/y;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 90
    .line 91
    .line 92
    sget-object v4, Lwf/g;->a:Lwf/g;

    .line 93
    .line 94
    const/4 v5, 0x1

    .line 95
    invoke-direct {v2, v3, v4, v5}, Lwf/s0;-><init>(Lsf/a;Lsf/a;I)V

    .line 96
    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    invoke-direct {v1, v2, v3}, Lwf/d;-><init>(Lsf/a;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1, p1}, Lxf/c;->b(Lsf/a;Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object v0, p0, Lu9/a;->f:Lfg/f;

    .line 107
    .line 108
    invoke-virtual {v0, p1}, Lfg/f;->setValue(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 112
    .line 113
    return-object p1

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
