.class public abstract Le/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lx0/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le/e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Le/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lx0/z;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lx0/z;-><init>(Lic/a;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Le/g;->a:Lx0/z;

    .line 13
    .line 14
    return-void
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

.method public static a(Lx0/o;)Ld/l0;
    .locals 5

    .line 1
    sget-object v0, Le/g;->a:Lx0/z;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld/l0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    const v0, 0x48071ead

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lx0/o;->W(I)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lx0/o2;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/view/View;

    .line 26
    .line 27
    const-string v3, "<this>"

    .line 28
    .line 29
    invoke-static {v0, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    if-eqz v0, :cond_3

    .line 33
    .line 34
    const v3, 0x7f0700a2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    instance-of v4, v3, Ld/l0;

    .line 42
    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    check-cast v3, Ld/l0;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    move-object v3, v1

    .line 49
    :goto_1
    if-eqz v3, :cond_1

    .line 50
    .line 51
    move-object v0, v3

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-static {v0}, Lud/e;->x(Landroid/view/View;)Landroid/view/ViewParent;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    instance-of v3, v0, Landroid/view/View;

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    check-cast v0, Landroid/view/View;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move-object v0, v1

    .line 65
    goto :goto_0

    .line 66
    :cond_3
    move-object v0, v1

    .line 67
    :goto_2
    invoke-virtual {p0, v2}, Lx0/o;->p(Z)V

    .line 68
    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const v3, 0x4807151c

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v3}, Lx0/o;->W(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v2}, Lx0/o;->p(Z)V

    .line 78
    .line 79
    .line 80
    :goto_3
    if-nez v0, :cond_7

    .line 81
    .line 82
    const v0, 0x48072680    # 138394.0f

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v0}, Lx0/o;->W(I)V

    .line 86
    .line 87
    .line 88
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lx0/o2;

    .line 89
    .line 90
    invoke-virtual {p0, v0}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Landroid/content/Context;

    .line 95
    .line 96
    :goto_4
    instance-of v3, v0, Landroid/content/ContextWrapper;

    .line 97
    .line 98
    if-eqz v3, :cond_6

    .line 99
    .line 100
    instance-of v3, v0, Ld/l0;

    .line 101
    .line 102
    if-eqz v3, :cond_5

    .line 103
    .line 104
    move-object v1, v0

    .line 105
    goto :goto_5

    .line 106
    :cond_5
    check-cast v0, Landroid/content/ContextWrapper;

    .line 107
    .line 108
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    goto :goto_4

    .line 113
    :cond_6
    :goto_5
    check-cast v1, Ld/l0;

    .line 114
    .line 115
    invoke-virtual {p0, v2}, Lx0/o;->p(Z)V

    .line 116
    .line 117
    .line 118
    return-object v1

    .line 119
    :cond_7
    const v1, 0x4807156d

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v1}, Lx0/o;->W(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v2}, Lx0/o;->p(Z)V

    .line 126
    .line 127
    .line 128
    return-object v0
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
