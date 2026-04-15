.class public final Ld7/l;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroidx/media3/ui/TrackSelectionView;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/TrackSelectionView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld7/l;->a:Landroidx/media3/ui/TrackSelectionView;

    .line 5
    .line 6
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget-object v0, p0, Ld7/l;->a:Landroidx/media3/ui/TrackSelectionView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/ui/TrackSelectionView;->g:Ljava/util/HashMap;

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/ui/TrackSelectionView;->c:Landroid/widget/CheckedTextView;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne p1, v2, :cond_0

    .line 9
    .line 10
    iput-boolean v3, v0, Landroidx/media3/ui/TrackSelectionView;->l:Z

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 13
    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_0
    iget-object v2, v0, Landroidx/media3/ui/TrackSelectionView;->d:Landroid/widget/CheckedTextView;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-ne p1, v2, :cond_1

    .line 21
    .line 22
    iput-boolean v4, v0, Landroidx/media3/ui/TrackSelectionView;->l:Z

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_1
    iput-boolean v4, v0, Landroidx/media3/ui/TrackSelectionView;->l:Z

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast v2, Ld7/m;

    .line 39
    .line 40
    iget-object v5, v2, Ld7/m;->a:Lm4/p1;

    .line 41
    .line 42
    iget-object v6, v5, Lm4/p1;->b:Lm4/j1;

    .line 43
    .line 44
    iget v2, v2, Ld7/m;->b:I

    .line 45
    .line 46
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    check-cast v7, Lm4/k1;

    .line 51
    .line 52
    if-nez v7, :cond_3

    .line 53
    .line 54
    iget-boolean p1, v0, Landroidx/media3/ui/TrackSelectionView;->i:Z

    .line 55
    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-lez p1, :cond_2

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 65
    .line 66
    .line 67
    :cond_2
    new-instance p1, Lm4/k1;

    .line 68
    .line 69
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-direct {p1, v6, v2}, Lm4/k1;-><init>(Lm4/j1;Ljava/util/List;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    goto/16 :goto_2

    .line 84
    .line 85
    :cond_3
    new-instance v8, Ljava/util/ArrayList;

    .line 86
    .line 87
    iget-object v7, v7, Lm4/k1;->b:Lya/i0;

    .line 88
    .line 89
    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 90
    .line 91
    .line 92
    check-cast p1, Landroid/widget/CheckedTextView;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/widget/CheckedTextView;->isChecked()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    iget-boolean v7, v0, Landroidx/media3/ui/TrackSelectionView;->h:Z

    .line 99
    .line 100
    if-eqz v7, :cond_4

    .line 101
    .line 102
    iget-boolean v5, v5, Lm4/p1;->c:Z

    .line 103
    .line 104
    if-eqz v5, :cond_4

    .line 105
    .line 106
    const/4 v5, 0x1

    .line 107
    goto :goto_0

    .line 108
    :cond_4
    const/4 v5, 0x0

    .line 109
    :goto_0
    if-nez v5, :cond_6

    .line 110
    .line 111
    iget-boolean v7, v0, Landroidx/media3/ui/TrackSelectionView;->i:Z

    .line 112
    .line 113
    if-eqz v7, :cond_5

    .line 114
    .line 115
    iget-object v7, v0, Landroidx/media3/ui/TrackSelectionView;->f:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-le v7, v3, :cond_5

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    const/4 v3, 0x0

    .line 125
    :cond_6
    :goto_1
    if-eqz p1, :cond_8

    .line 126
    .line 127
    if-eqz v3, :cond_8

    .line 128
    .line 129
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_7

    .line 141
    .line 142
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    new-instance p1, Lm4/k1;

    .line 147
    .line 148
    invoke-direct {p1, v6, v8}, Lm4/k1;-><init>(Lm4/j1;Ljava/util/List;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_8
    if-nez p1, :cond_a

    .line 156
    .line 157
    if-eqz v5, :cond_9

    .line 158
    .line 159
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    new-instance p1, Lm4/k1;

    .line 167
    .line 168
    invoke-direct {p1, v6, v8}, Lm4/k1;-><init>(Lm4/j1;Ljava/util/List;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_9
    new-instance p1, Lm4/k1;

    .line 176
    .line 177
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-static {v2}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-direct {p1, v6, v2}, Lm4/k1;-><init>(Lm4/j1;Ljava/util/List;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    :cond_a
    :goto_2
    invoke-virtual {v0}, Landroidx/media3/ui/TrackSelectionView;->a()V

    .line 192
    .line 193
    .line 194
    return-void
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
